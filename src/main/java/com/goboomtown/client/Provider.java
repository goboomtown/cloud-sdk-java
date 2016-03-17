package com.goboomtown.client;

import io.swagger.client.ApiException;
import io.swagger.client.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Provider OOP lazy-fetched model+controller example.
 */
public final class Provider {
    private final String id;
    private final String name;
    private final String nameLegal;
    private final String nickname;
    private final String commId;
    private final String description;
    private final String street1;
    private final String street2;
    private final String city;
    private final String state;
    private final String zipcode;
    private final Float latitude;
    private final Float longitude;
    private final String defaultPartnersTeamsId;
    private final String email;
    private final String phone;
    private final String website;
    private final String avatar;
    private final Date created;
    private final Date updated;

    private Provider(String id, String name, String nameLegal, String nickname, String commId, String description, String street1, String street2, String city, String state, String zipcode, Float latitude, Float longitude, String defaultPartnersTeamsId, String email, String phone, String website, String avatar, Date created, Date updated) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("invalid id");
        }

        this.id = id;
        this.name = name;
        this.nameLegal = nameLegal;
        this.nickname = nickname;
        this.commId = commId;
        this.description = description;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.defaultPartnersTeamsId = defaultPartnersTeamsId;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.avatar = avatar;
        this.created = created;
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNameLegal() {
        return nameLegal;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCommId() {
        return commId;
    }

    public String getDescription() {
        return description;
    }

    public String getStreet1() {
        return street1;
    }

    public String getStreet2() {
        return street2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public String getDefaultPartnersTeamsId() {
        return defaultPartnersTeamsId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getAvatar() {
        return avatar;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

    /**
     * @return This provider's teams.
     * @throws ApiException On API call failure
     */
    public List<Team> getTeams() throws ApiException {
        List<Team> teams = new ArrayList<Team>();
        ProviderTeamResponse providerTeams = ApiUtil.getProvidersApi().getProviderTeams();
        if (providerTeams.getSuccess() != null && providerTeams.getSuccess()) {
            for (ProviderTeam entity : providerTeams.getResults()) {
                teams.add(Team.fromEntity(entity));
            }
        } else {
            throw new ApiException(providerTeams.getMessage());
        }
        return teams;
    }

    /**
     * @return This provider's team with id={@code teamId}.
     * @throws ApiException On API call failure
     */
    public Team getTeam(String teamId) throws ApiException, IllegalArgumentException {
        ProviderTeamResponse providerTeam = ApiUtil.getProvidersApi().getProviderTeam(teamId);
        if (providerTeam.getSuccess() != null && providerTeam.getSuccess() && providerTeam.getResults().size() == 1) {
            return Team.fromEntity(providerTeam.getResults().get(0));
        } else {
            throw new ApiException(providerTeam.getMessage());
        }
    }

    /**
     * @return Merchants associated to this provider's teams.
     * @throws ApiException On API call failure
     */
    public List<Merchant> getMerchants() throws ApiException {
        List<Merchant> merchants = new ArrayList<Merchant>();
        MemberResponse providerMembers = ApiUtil.getProvidersApi().getProviderMembers();
        if (providerMembers.getSuccess() != null && providerMembers.getSuccess()) {
            for (Member entity : providerMembers.getResults()) {
                merchants.add(Merchant.fromEntity(entity));
            }
        } else {
            throw new ApiException(providerMembers.getMessage());
        }
        return merchants;
    }

    /**
     * @return An instance of CreateMerchantResult, containing the new merchant, location, and/or user.
     * @throws ApiException On API call failure
     */
    public CreateMerchantResult createMerchant(Member member, MemberUser user, MemberLocation location) throws ApiException {
        MemberCreateRequest createRequest = new MemberCreateRequest();
        createRequest.setMembers(member);
        createRequest.setMembersLocations(location);
        createRequest.setMembersUsers(user);

        MemberCreateResponse response = ApiUtil.getMerchantsApi().createMember(createRequest);

        return new CreateMerchantResult(
                Merchant.fromEntity(response.getResults().getMember()),
                Merchant.User.fromEntity(response.getResults().getMemberUser()),
                Merchant.Location.fromEntity(response.getResults().getMemberLocation())
        );
    }

    /**
     * @return Issues belonging to any merchant associated to any one of this provider's teams.
     * @throws ApiException On API call failure
     */
    public List<Issue> getIssues(Integer limit, Integer start) throws ApiException {
        List<Issue> issues = new ArrayList<Issue>();
        IssueResponse issuesResponse = ApiUtil.getIssuesApi().getIssues(limit, start, null, null, null);
        if (issuesResponse.getSuccess() != null && issuesResponse.getSuccess()) {
            for (io.swagger.client.model.Issue entity : issuesResponse.getResults()) {
                issues.add(Issue.fromEntity(entity));
            }
        } else {
            throw new ApiException(issuesResponse.getMessage());
        }
        return issues;
    }

    /**
     * @return Issue belonging to any merchant associated to any one of this provider's teams, with id={@code issueId}.
     * @throws ApiException On API call failure
     */
    public Issue getIssue(String issueId) throws ApiException {
        IssueResponse issuesResponse = ApiUtil.getIssuesApi().getIssue(issueId);
        if (issuesResponse.getSuccess() != null && issuesResponse.getSuccess() && issuesResponse.getResults().size() == 1) {
            return Issue.fromEntity(issuesResponse.getResults().get(0));
        } else {
            throw new ApiException(issuesResponse.getMessage());
        }
    }


    /**
     * Parses the API model response into this OOP lazy-fetched model+controller.
     */
    public static Provider fromEntity(io.swagger.client.model.Provider entity) {
        return new Provider(
                entity.getId(),
                entity.getName(),
                entity.getNameLegal(),
                entity.getNickname(),
                entity.getCommId(),
                entity.getDescription(),
                entity.getStreet1(),
                entity.getStreet2(),
                entity.getCity(),
                entity.getState(),
                entity.getZipcode(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.getDefaultPartnersTeamsId(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getWebsite(),
                entity.getAvatar(),
                entity.getCreated(),
                entity.getUpdated()
        );
    }

    /**
     * @return Load a new provider instance from the cloud.
     * @throws ApiException
     */
    public static Provider getInstance() throws ApiException {
        ProviderResponse providerResponse = ApiUtil.getProvidersApi().getProvider();
        if (providerResponse.getSuccess() != null && providerResponse.getSuccess() && providerResponse.getResults().size() == 1) {
            return Provider.fromEntity(providerResponse.getResults().get(0));
        } else {
            throw new RuntimeException(providerResponse.getMessage());
        }
    }


    /**
     * Provider.Team OOP lazy-fetched model+controller example.
     */
    public static final class Team {
        private final String id;
        private final String name;
        private final String nickname;
        private final String description;
        private final String email;
        private final String phone;
        private final String avatar;
        private final Boolean autoAssignRoute;
        private final Boolean autoAssignSponsor;
        private final String status;
        private final String type;
        private final Boolean exclusive;
        private final Boolean published;
        private final String publishedName;
        private final Boolean privateLabel;
        private final String brandColor1;
        private final String brandLogo1x;
        private final String brandLogo2x;
        private final String brandLogo3x;
        private final Date created;
        private final Date updated;

        private Team(String id, String name, String nickname, String description, String email, String phone, String avatar, Boolean autoAssignRoute, Boolean autoAssignSponsor, String status, String type, Boolean exclusive, Boolean published, String publishedName, Boolean privateLabel, String brandColor1, String brandLogo1x, String brandLogo2x, String brandLogo3x, Date created, Date updated) {
            if (id == null || id.trim().isEmpty()) {
                throw new IllegalArgumentException("invalid id");
            }

            this.id = id;
            this.name = name;
            this.nickname = nickname;
            this.description = description;
            this.email = email;
            this.phone = phone;
            this.avatar = avatar;
            this.autoAssignRoute = autoAssignRoute;
            this.autoAssignSponsor = autoAssignSponsor;
            this.status = status;
            this.type = type;
            this.exclusive = exclusive;
            this.published = published;
            this.publishedName = publishedName;
            this.privateLabel = privateLabel;
            this.brandColor1 = brandColor1;
            this.brandLogo1x = brandLogo1x;
            this.brandLogo2x = brandLogo2x;
            this.brandLogo3x = brandLogo3x;
            this.created = created;
            this.updated = updated;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getNickname() {
            return nickname;
        }

        public String getDescription() {
            return description;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public String getAvatar() {
            return avatar;
        }

        public Boolean getAutoAssignRoute() {
            return autoAssignRoute;
        }

        public Boolean getAutoAssignSponsor() {
            return autoAssignSponsor;
        }

        public String getStatus() {
            return status;
        }

        public String getType() {
            return type;
        }

        public Boolean getExclusive() {
            return exclusive;
        }

        public Boolean getPublished() {
            return published;
        }

        public String getPublishedName() {
            return publishedName;
        }

        public Boolean getPrivateLabel() {
            return privateLabel;
        }

        public String getBrandColor1() {
            return brandColor1;
        }

        public String getBrandLogo1x() {
            return brandLogo1x;
        }

        public String getBrandLogo2x() {
            return brandLogo2x;
        }

        public String getBrandLogo3x() {
            return brandLogo3x;
        }

        public Date getCreated() {
            return created;
        }

        public Date getUpdated() {
            return updated;
        }


        /**
         * Parses the API model response into this OOP lazy-fetched model+controller.
         */
        public static Team fromEntity(io.swagger.client.model.ProviderTeam entity) {
            return new Team(
                    entity.getId(),
                    entity.getName(),
                    entity.getNickname(),
                    entity.getDescription(),
                    entity.getEmail(),
                    entity.getPhone(),
                    entity.getAvatar(),
                    entity.getAutoAssignRoute(),
                    entity.getAutoAssignSponsor(),
                    entity.getStatus(),
                    entity.getType(),
                    entity.getExclusive(),
                    entity.getPublished(),
                    entity.getPublishedName(),
                    entity.getPrivateLabel(),
                    entity.getBrandColor1(),
                    entity.getBrandLogo1x(),
                    entity.getBrandLogo2x(),
                    entity.getBrandLogo3x(),
                    entity.getCreated(),
                    entity.getUpdated()
            );
        }
    }

    /**
     * Wrapper for the member, user, and location model+controller returned from the createMember() call.
     */
    public static final class CreateMerchantResult {
        private final Merchant merchant;
        private final Merchant.User user;
        private final Merchant.Location location;

        public CreateMerchantResult(Merchant merchant, Merchant.User user, Merchant.Location location) {
            this.merchant = merchant;
            this.user = user;
            this.location = location;
        }

        public Merchant getMerchant() {
            return merchant;
        }

        public Merchant.User getUser() {
            return user;
        }

        public Merchant.Location getLocation() {
            return location;
        }
    }
}
