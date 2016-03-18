package com.goboomtown.client.example;

import com.goboomtown.sdk.ApiUtil;
import com.goboomtown.sdk.swagger.ApiException;
import com.goboomtown.sdk.swagger.model.Member;
import com.goboomtown.sdk.swagger.model.MemberLocation;
import com.goboomtown.sdk.swagger.model.MemberUser;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Example Boomtown Provider API client.
 */
public class ApiExample {
    private static final String TOKEN = "__API_TOKEN__";
    private static final String KEY = "__API_SECRET_KEY__";

    public static final DateFormat DATE_FORMAT_DISPLAY = new SimpleDateFormat("M/d/yyyy h:mm:ss a");

    static {
        // statically initialize ApiUtil
        try {
            ApiUtil.initialize(TOKEN, KEY);
        } catch (NoSuchAlgorithmException e) {
            throw new ExceptionInInitializerError(e);
        } catch (UnsupportedEncodingException e) {
            throw new ExceptionInInitializerError(e);
        } catch (InvalidKeyException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /**
     * Wrapper for {@code Provider.getInstance()}.
     *
     * @return A new provider model+controller, as fetched from the API.
     * @throws ApiException On API call failure
     */
    public Provider getProvider() throws ApiException {
        return Provider.getInstance();
    }

    /**
     * Example of fetching a provider, and dumping key information associated with the provider.
     *
     * @throws ApiException On API call failure
     */
    private void exampleGetProvider() throws ApiException {
        Provider provider = Provider.getInstance();

        println(String.format("Provider: %s (%s):", provider.getName(), provider.getId()));

        println("\tMembers:");
        for (Merchant merchant : provider.getMerchants()) {
            println(String.format("\t%s (%s)", merchant.getName(), merchant.getId()));

            println("\t\tLocations:");
            for (Merchant.Location location : merchant.getLocations()) {
                println(String.format("\t\t\t%s (%s)", location.getZipcode(), location.getId()));

                List<Issue> issues = location.getIssues(5, 0);
                if (!issues.isEmpty()) {
                    println("\t\t\t\tIssues:");
                    for (Issue issue: issues) {
                        printIssue(issue, "\t\t\t\t\t", false);
                    }
                }
            }

            println("\t\tUsers:");
            for (Merchant.User user : merchant.getUsers()) {
                println(String.format("\t\t\t%s (%s)", user.getFullName(), user.getId()));

                List<Issue> issues = user.getIssues(5, 0);
                if (!issues.isEmpty()) {
                    println("\t\t\t\tIssues:");
                    for (Issue issue : issues) {
                        printIssue(issue, "\t\t\t\t\t", false);
                    }
                }
            }

            List<Issue> issues = merchant.getIssues(5, 0);
            if (!issues.isEmpty()) {
                println("\t\tIssues:");
                for (Issue issue: issues) {
                    printIssue(issue, "\t\t\t", false);
                }
            }

            println("");
        }

        println("");
    }

    /**
     * Example of fetching issues belonging to merchants associated to the provider.
     *
     * @throws ApiException On API call failure
     */
    private void exampleGetIssues() throws ApiException {
        println("Issues:");
        List<Issue> issues = Provider.getInstance().getIssues(5, 0);
        for (Issue issue : issues) {
            printIssue(issue, "\t", true);
            println("");
        }

        println("");
    }

    /**
     * Example of adding notes to an existing issue belonging to a merchant associated to the provider.
     *
     * @throws ApiException On API call failure
     */
    private void exampleAddIssueNotes() throws ApiException {
        Provider provider = getProvider();
        List<Issue> issues = provider.getIssues(1, 0);
        if (issues.size() != 1) {
            throw new IllegalStateException("no issues available");
        }

        Issue issue = issues.get(0);

        println("Issue before change:");
        printIssue(issue, "\t", true);
        println("");

        issue.addNote("yaaaaar NEW NOTE");

        println("Issue after change:");
        printIssue(issue, "\t", true);
        println("");
    }

    /**
     * Example of resolving an existing issue belonging to a merchant associated to the provider.
     *
     * @throws ApiException On API call failure
     */
    private void exampleResolveIssue() throws ApiException {
        Provider provider = getProvider();
        List<Issue> issues = provider.getIssues(1, 0);
        if (issues.size() != 1) {
            throw new IllegalStateException("no issues available");
        }

        Issue issue = issues.get(0);

        println("Issue before change:");
        printIssue(issue, "\t", true);
        println("");

        issue.resolve();

        println("Issue after change:");
        printIssue(issue, "\t", true);
        println("");
    }

    /**
     * Example of creating a new merchant, user, and/or location, which is associated to this provider.
     *
     * @throws ApiException On API call failure
     */
    private void exampleCreateMerchant() throws ApiException {
        Provider provider = Provider.getInstance();

        println("Create member:");

        Member newMember = new Member();
        newMember.setName("yar name");
        newMember.setPhone("11235555522");
        newMember.setZipcode("12345");
        newMember.setEmail("yar123zzzz@YAR_DOMAIN.me");

        MemberLocation newLocation = new MemberLocation();
        newLocation.setZipcode("12345");

        MemberUser newUser = new MemberUser();
        newUser.setFirstName("yar first");
        newUser.setLastName("yar last");
        newUser.setEmail("yar123zzzz@YAR_DOMAIN.me");

        Provider.CreateMerchantResult result = provider.createMerchant(newMember, newUser, newLocation);

        // dump effected entities
        Merchant merchant = result.getMerchant();
        println(String.format("\tMember: %s (%s)", merchant.getName(), merchant.getId()));

        Merchant.User merchantUser = result.getUser();
        println(String.format("\tUser: %s (%s)", merchantUser.getFullName(), merchantUser.getId()));

        Merchant.Location merchantLocation = result.getLocation();
        println(String.format("\tLocation: %s (%s)", merchantLocation.getZipcode(), merchantLocation.getId()));
        println("");

        // dump all locations/users of the effected merchant
        println(String.format("\t%s (%s)", merchant.getName(), merchant.getId()));
        println("\t\tLocations:");
        for (Merchant.Location location : merchant.getLocations()) {
            println(String.format("\t\t\t%s (%s)", location.getZipcode(), location.getId()));
        }

        println("\t\tUsers:");
        for (Merchant.User user : merchant.getUsers()) {
            println(String.format("\t\t\t%s (%s)", user.getFullName(), user.getId()));
        }

        println("");
    }


    /**
     * System.out.println wrapper.
     */
    private static void println(String format) {
        System.out.println(format);
    }

    /**
     * Issue debug printer
     */
    private static void printIssue(Issue issue, String indent, boolean withDetail) throws ApiException {
        println(String.format("%s%s (%s)", indent, issue.getId(), issue.getReferenceNum()));
        println(String.format("%s\tcreated: %s", indent, DATE_FORMAT_DISPLAY.format(issue.getCreated())));
        println(String.format("%s\tcategory: %s", indent, issue.getCategory()));
        println(String.format("%s\tstatus: %s", indent, issue.getStatus()));
        println(String.format("%s\tresolution: %s", indent, issue.getResolution()));
        println(String.format("%s\tmemberId: %s", indent, issue.getMembersId()));
        println(String.format("%s\tmemberUserId: %s", indent, issue.getMembersUsersId()));
        println(String.format("%s\tmemberLocId: %s", indent, issue.getMembersLocationsId()));

        if (withDetail) {
            println(String.format("%s\tLogs:", indent));
            for (Issue.Log log : issue.getLogs()) {
                println(String.format("%s\t\t%s", indent, DATE_FORMAT_DISPLAY.format(log.getCreated())));
                println(String.format("%s\t\t\tnotes: %s", indent, log.getNotes()));
                println(String.format("%s\t\t\tdiffLog: %s", indent, log.getDiffLog()));
            }

            println(String.format("%s\tStatus history:", indent));
            for (Issue.StatusHistory statusHistory : issue.getStatusHistory()) {
                println(String.format("%s\t\t%s", indent, DATE_FORMAT_DISPLAY.format(statusHistory.getCreated())));
                println(String.format("%s\t\t\tstatus: %s", indent, statusHistory.getStatus()));
                println(String.format("%s\t\t\ttype: %s", indent, statusHistory.getType()));
                println(String.format("%s\t\t\tresolution: %s", indent, statusHistory.getResolution()));
                println(String.format("%s\t\t\tscheduledTime: %s", indent, statusHistory.getScheduledTime()));
                println(String.format("%s\t\t\thistoryText: %s", indent, statusHistory.getHistorySummaryText()));
                println(String.format("%s\t\t\tsummaryText: %s", indent, statusHistory.getTicketSummaryText()));
            }
        }
    }

    /**
     * Example main/application/usage.
     *
     * @param args Input arguments
     * @throws ApiException
     */
    public static void main(String[] args) throws ApiException {
        ApiExample api = new ApiExample();

        api.exampleGetProvider();

        //api.exampleGetIssues();

        //api.exampleAddIssueNotes();
        //api.exampleResolveIssue();

        //api.exampleCreateMerchant();
    }
}
