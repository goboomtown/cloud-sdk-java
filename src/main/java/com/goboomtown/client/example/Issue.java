package com.goboomtown.client.example;

import com.goboomtown.sdk.ApiUtil;
import io.swagger.client.ApiException;
import io.swagger.client.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Issue OOP lazy-fetched model+controller example.
 */
public final class Issue {
    private final String id;
    private final String referenceNum;
    private final Date created;
    private String membersId;
    private String membersName;
    private String membersEmail;
    private String membersLocationsId;
    private String membersLocationsName;
    private String membersUsersId;
    private String membersUsersName;
    private String membersUsersEmail;
    private String type;
    private String category;
    private String details;
    private String status;
    private String job;
    private String resolution;
    private Date updated;
    private Date enrouteTime;
    private Date scheduledTime;
    private Date arrivalTime;
    private Date departureTime;

    private Issue(String id, String referenceNum, String membersId, String membersName, String membersEmail, String membersLocationsId, String membersLocationsName, String membersUsersId, String membersUsersName, String membersUsersEmail, String type, String category, String details, String status, String job, String resolution, Date created, Date updated, Date enrouteTime, Date scheduledTime, Date arrivalTime, Date departureTime) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("invalid id");
        }
        else if (membersId == null || membersId.trim().isEmpty()) {
            throw new IllegalArgumentException("invalid membersId");
        }
        else if (membersUsersId == null || membersUsersId.trim().isEmpty()) {
            throw new IllegalArgumentException("invalid membersUsersId");
        }
        else if (membersLocationsId == null || membersLocationsId.trim().isEmpty()) {
            throw new IllegalArgumentException("invalid membersLocationsId");
        }

        this.id = id;
        this.referenceNum = referenceNum;
        this.membersId = membersId;
        this.membersName = membersName;
        this.membersEmail = membersEmail;
        this.membersLocationsId = membersLocationsId;
        this.membersLocationsName = membersLocationsName;
        this.membersUsersId = membersUsersId;
        this.membersUsersName = membersUsersName;
        this.membersUsersEmail = membersUsersEmail;
        this.type = type;
        this.category = category;
        this.details = details;
        this.status = status;
        this.job = job;
        this.resolution = resolution;
        this.created = created;
        this.updated = updated;
        this.enrouteTime = enrouteTime;
        this.scheduledTime = scheduledTime;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    private Issue updateModel(String id, String referenceNum, String membersId, String membersName, String membersEmail, String membersLocationsId, String membersLocationsName, String membersUsersId, String membersUsersName, String membersUsersEmail, String type, String category, String details, String status, String job, String resolution, Date created, Date updated, Date enrouteTime, Date scheduledTime, Date arrivalTime, Date departureTime) {
        if (!this.id.equals(id)) {
            throw new IllegalArgumentException("invalid id");
        }
        else if (!this.referenceNum.equals(referenceNum)) {
            throw new IllegalArgumentException("invalid referenceNum");
        }
        this.membersId = membersId;
        this.membersName = membersName;
        this.membersEmail = membersEmail;
        this.membersLocationsId = membersLocationsId;
        this.membersLocationsName = membersLocationsName;
        this.membersUsersId = membersUsersId;
        this.membersUsersName = membersUsersName;
        this.membersUsersEmail = membersUsersEmail;
        this.type = type;
        this.category = category;
        this.details = details;
        this.status = status;
        this.job = job;
        this.resolution = resolution;
        this.updated = updated;
        this.enrouteTime = enrouteTime;
        this.scheduledTime = scheduledTime;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    public String getMembersId() {
        return membersId;
    }

    public String getMembersName() {
        return membersName;
    }

    public String getMembersEmail() {
        return membersEmail;
    }

    public String getMembersLocationsId() {
        return membersLocationsId;
    }

    public String getMembersLocationsName() {
        return membersLocationsName;
    }

    public String getMembersUsersId() {
        return membersUsersId;
    }

    public String getMembersUsersName() {
        return membersUsersName;
    }

    public String getMembersUsersEmail() {
        return membersUsersEmail;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getDetails() {
        return details;
    }

    public String getStatus() {
        return status;
    }

    public String getJob() {
        return job;
    }

    public String getResolution() {
        return resolution;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

    public Date getEnrouteTime() {
        return enrouteTime;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    /**
     * @return The merchant served by this this issue.
     * @throws ApiException On API call failure
     */
    public Merchant getMerchant() throws ApiException {
        MemberResponse memberResponse = ApiUtil.getMerchantsApi().getMember(membersId);
        if (memberResponse.getSuccess() != null && memberResponse.getSuccess() && memberResponse.getResults().size() == 1) {
            return Merchant.fromEntity(memberResponse.getResults().get(0));
        } else {
            throw new ApiException(memberResponse.getMessage());
        }
    }

    /**
     * @return The merchant's user served by this this issue.
     * @throws ApiException On API call failure
     */
    public Merchant.User getMerchantUser() throws ApiException {
        MemberUserResponse userResponse = ApiUtil.getMerchantsApi().getMemberUsers(membersId, membersUsersId);
        if (userResponse.getSuccess() != null && userResponse.getSuccess() && userResponse.getResults().size() == 1) {
            return Merchant.User.fromEntity(userResponse.getResults().get(0));
        } else {
            throw new ApiException(userResponse.getMessage());
        }
    }

    /**
     * @return The merchant's location served by this this issue.
     * @throws ApiException On API call failure
     */
    public Merchant.Location getMerchantLocation() throws ApiException {
        MemberLocationResponse locationResponse = ApiUtil.getMerchantsApi().getMemberLocations(membersId, membersLocationsId);
        if (locationResponse.getSuccess() != null && locationResponse.getSuccess() && locationResponse.getResults().size() == 1) {
            return Merchant.Location.fromEntity(locationResponse.getResults().get(0));
        } else {
            throw new ApiException(locationResponse.getMessage());
        }
    }

    /**
     * @return This issue's logs, from the server.
     * @throws ApiException On API call failure
     */
    public List<Log> getLogs() throws ApiException {
        List<Log> logs = new ArrayList<Log>();
        IssueLogsResponse issueLogs = ApiUtil.getIssuesApi().getIssueLogs(id);
        if (issueLogs.getSuccess() != null && issueLogs.getSuccess()) {
            for (IssueLog entity : issueLogs.getResults()) {
                logs.add(Log.fromEntity(entity));
            }
        } else {
            throw new ApiException(issueLogs.getMessage());
        }
        return logs;
    }

    /**
     * @return This issue's status history, from the server.
     * @throws ApiException On API call failure
     */
    public List<StatusHistory> getStatusHistory() throws ApiException {
        List<StatusHistory> statusHistories = new ArrayList<StatusHistory>();
        IssueStatusesResponse issueStatusHistory = ApiUtil.getIssuesApi().getIssueStatusHistory(id);
        if (issueStatusHistory.getSuccess() != null && issueStatusHistory.getSuccess()) {
            for (IssueStatus entity : issueStatusHistory.getResults()) {
                statusHistories.add(StatusHistory.fromEntity(entity));
            }
        } else {
            throw new ApiException(issueStatusHistory.getMessage());
        }
        return statusHistories;
    }

    /**
     * Add a note to the issue.
     *
     * @throws ApiException On API call failure
     */
    public void addNote(String notes) throws ApiException {
        ApiUtil.getIssuesApi().createIssueLog(id, notes);
    }

    /**
     * Resolves the issue, and updates this model.
     *
     * @return This instance
     * @throws ApiException On API call failure
     */
    public Issue resolve() throws ApiException {
        ApiUtil.getIssuesApi().resolveIssue(id);
        update();
        return this;
    }

    /**
     * Updates this issue with the latest values from the cloud.
     *
     * @return This instance
     * @throws ApiException On API call failure
     */
    public Issue update() throws ApiException {
        IssueResponse issuesResponse = ApiUtil.getIssuesApi().getIssue(id);
        if (issuesResponse.getSuccess() != null && issuesResponse.getSuccess() && issuesResponse.getResults().size() == 1) {
            return updateEntity(this, issuesResponse.getResults().get(0));
        } else {
            throw new ApiException(issuesResponse.getMessage());
        }
    }


    /**
     * Parses the API model response into this OOP lazy-fetched model+controller.
     */
    public static Issue fromEntity(io.swagger.client.model.Issue entity) {
        return new Issue(
                entity.getId(),
                entity.getReferenceNum(),
                entity.getMembersId(),
                entity.getMembersName(),
                entity.getMembersEmail(),
                entity.getMembersLocationsId(),
                entity.getMembersLocationsName(),
                entity.getMembersUsersId(),
                entity.getMembersUsersName(),
                entity.getMembersUsersEmail(),
                entity.getType(),
                entity.getCategory(),
                entity.getDetails(),
                entity.getStatus(),
                entity.getJob(),
                entity.getResolution(),
                entity.getCreated(),
                entity.getUpdated(),
                entity.getEnrouteTime(),
                entity.getScheduledTime(),
                entity.getArrivalTime(),
                entity.getDepartureTime()
        );
    }

    /**
     * Updates {@code issue}'s properties with the latest data in {@code entity}.
     *
     * @param issue The issue to update
     * @param entity The latest entity from the server
     * @return The same instance as passed ({@code issue})
     */
    public static Issue updateEntity(Issue issue, io.swagger.client.model.Issue entity) {
        return issue.updateModel(
                entity.getId(),
                entity.getReferenceNum(),
                entity.getMembersId(),
                entity.getMembersName(),
                entity.getMembersEmail(),
                entity.getMembersLocationsId(),
                entity.getMembersLocationsName(),
                entity.getMembersUsersId(),
                entity.getMembersUsersName(),
                entity.getMembersUsersEmail(),
                entity.getType(),
                entity.getCategory(),
                entity.getDetails(),
                entity.getStatus(),
                entity.getJob(),
                entity.getResolution(),
                entity.getCreated(),
                entity.getUpdated(),
                entity.getEnrouteTime(),
                entity.getScheduledTime(),
                entity.getArrivalTime(),
                entity.getDepartureTime()
        );
    }


    /**
     * Issue.Log OOP lazy-fetched model+controller example.
     */
    public static final class Log {
        private final String id;
        private final String issuesId;
        private final String diffLog;
        private final String notes;
        private final Date created;

        private Log(String id, String issuesId, String diffLog, String notes, Date created) {
            if (id == null || id.trim().isEmpty()) {
                throw new IllegalArgumentException("invalid id");
            }
            else if (issuesId == null || issuesId.trim().isEmpty()) {
                throw new IllegalArgumentException("invalid issuesId");
            }

            this.id = id;
            this.issuesId = issuesId;
            this.diffLog = diffLog;
            this.notes = notes;
            this.created = created;
        }

        public String getId() {
            return id;
        }

        public String getIssuesId() {
            return issuesId;
        }

        public String getDiffLog() {
            return diffLog;
        }

        public String getNotes() {
            return notes;
        }

        public Date getCreated() {
            return created;
        }


        public static Log fromEntity(io.swagger.client.model.IssueLog entity) {
            return new Log(
                    entity.getId(),
                    entity.getIssuesId(),
                    entity.getDiffLog(),
                    entity.getNotes(),
                    entity.getCreated()
            );
        }
    }

    /**
     * Issue.StatusHistory OOP lazy-fetched model+controller example.
     */
    public static final class StatusHistory {
        private final Date created;
        private final String type;
        private final String status;
        private final String resolution;
        private final Date scheduledTime;
        private final String ticketSummaryText;
        private final String historySummaryText;

        private StatusHistory(Date created, String type, String status, String resolution, Date scheduledTime, String ticketSummaryText, String historySummaryText) {
            this.created = created;
            this.type = type;
            this.status = status;
            this.resolution = resolution;
            this.scheduledTime = scheduledTime;
            this.ticketSummaryText = ticketSummaryText;
            this.historySummaryText = historySummaryText;
        }

        public Date getCreated() {
            return created;
        }

        public String getType() {
            return type;
        }

        public String getStatus() {
            return status;
        }

        public String getResolution() {
            return resolution;
        }

        public Date getScheduledTime() {
            return scheduledTime;
        }

        public String getTicketSummaryText() {
            return ticketSummaryText;
        }

        public String getHistorySummaryText() {
            return historySummaryText;
        }


        public static StatusHistory fromEntity(io.swagger.client.model.IssueStatus entity) {
            return new StatusHistory(
                    entity.getCreated(),
                    entity.getType(),
                    entity.getStatus(),
                    entity.getResolution(),
                    entity.getScheduledTime(),
                    entity.getTicketSummaryText(),
                    entity.getHistorySummaryText()
            );
        }
    }
}
