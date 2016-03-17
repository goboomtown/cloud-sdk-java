package com.goboomtown.client;

import io.swagger.client.ApiException;
import io.swagger.client.model.*;
import org.slf4j.helpers.MessageFormatter;

import java.util.List;

/**
 * Example Boomtown Provider API client.
 *
 * @see Constants for configuration
 */
public class ApiExample {
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

        println("Provider: {} ({}):", provider.getName(), provider.getId());

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
     * Formatted string printer.
     *
     * @param format String format, {} refers to variable arguments
     * @param args Variable arguments, replaces {} in {@code format}
     */
    private static void println(String format, Object... args) {
        System.out.println(MessageFormatter.arrayFormat(format, args).getMessage());
    }

    /**
     * Issue debug printer
     */
    private static void printIssue(Issue issue, String indent, boolean withDetail) throws ApiException {
        println("{}{} ({})", indent, issue.getId(), issue.getReferenceNum());
        println("{}\tcreated: {}", indent, Constants.DATE_FORMAT_DISPLAY.format(issue.getCreated()));
        println("{}\tcategory: {}", indent, issue.getCategory());
        println("{}\tstatus: {}", indent, issue.getStatus());
        println("{}\tresolution: {}", indent, issue.getResolution());
        println("{}\tmemberId: {}", indent, issue.getMembersId());
        println("{}\tmemberUserId: {}", indent, issue.getMembersUsersId());
        println("{}\tmemberLocId: {}", indent, issue.getMembersLocationsId());

        if (withDetail) {
            println("{}\tLogs:", indent);
            for (Issue.Log log : issue.getLogs()) {
                println("{}\t\t{}", indent, Constants.DATE_FORMAT_DISPLAY.format(log.getCreated()));
                println("{}\t\t\tnotes: {}", indent, log.getNotes());
                println("{}\t\t\tdiffLog: {}", indent, log.getDiffLog());
            }

            println("{}\tStatus history:", indent);
            for (Issue.StatusHistory statusHistory : issue.getStatusHistory()) {
                println("{}\t\t{}", indent, Constants.DATE_FORMAT_DISPLAY.format(statusHistory.getCreated()));
                println("{}\t\t\tstatus: {}", indent, statusHistory.getStatus());
                println("{}\t\t\ttype: {}", indent, statusHistory.getType());
                println("{}\t\t\tresolution: {}", indent, statusHistory.getResolution());
                println("{}\t\t\tscheduledTime: {}", indent, statusHistory.getScheduledTime());
                println("{}\t\t\thistoryText: {}", indent, statusHistory.getHistorySummaryText());
                println("{}\t\t\tsummaryText: {}", indent, statusHistory.getTicketSummaryText());
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
