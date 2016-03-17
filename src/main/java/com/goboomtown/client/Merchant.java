package com.goboomtown.client;

import io.swagger.client.ApiException;
import io.swagger.client.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Merchant OOP lazy-fetched model+controller example.
 */
public final class Merchant {
    private final String id;
    private final String name;
    private final String nameLegal;
    private final String street1;
    private final String street2;
    private final String city;
    private final String state;
    private final String zipcode;
    private final String email;
    private final String phone;
    private final String industry;
    private final String status;
    private final Date created;

    private Merchant(String id, String name, String nameLegal, String street1, String street2, String city, String state, String zipcode, String email, String phone, String industry, String status, Date created) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("invalid id");
        }

        this.id = id;
        this.name = name;
        this.nameLegal = nameLegal;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.email = email;
        this.phone = phone;
        this.industry = industry;
        this.status = status;
        this.created = created;
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

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getIndustry() {
        return industry;
    }

    public String getStatus() {
        return status;
    }

    public Date getCreated() {
        return created;
    }

    /**
     * @return Locations belonging to this merchant.
     * @throws ApiException On API call failure
     */
    public List<Location> getLocations() throws ApiException {
        List<Location> locations = new ArrayList<Location>();
        MemberLocationResponse memberLocations = ApiUtil.getMerchantsApi().getMemberLocations(id, null);
        if (memberLocations.getSuccess() != null && memberLocations.getSuccess()) {
            for (MemberLocation entity : memberLocations.getResults()) {
                locations.add(Location.fromEntity(entity));
            }
        } else {
            throw new ApiException(memberLocations.getMessage());
        }
        return locations;
    }

    /**
     * @return Users belonging to this merchant.
     * @throws ApiException On API call failure
     */
    public List<User> getUsers() throws ApiException {
        List<User> users = new ArrayList<User>();
        MemberUserResponse memberUsers = ApiUtil.getMerchantsApi().getMemberUsers(id, null);
        if (memberUsers.getSuccess() != null && memberUsers.getSuccess()) {
            for (MemberUser entity : memberUsers.getResults()) {
                users.add(User.fromEntity(entity));
            }
        } else {
            throw new ApiException(memberUsers.getMessage());
        }
        return users;
    }

    /**
     * @return Issues belonging to this merchant.
     * @throws ApiException On API call failure
     */
    public List<Issue> getIssues(Integer limit, Integer start) throws ApiException {
        List<Issue> issues = new ArrayList<Issue>();
        IssueResponse issuesResponse = ApiUtil.getIssuesApi().getIssues(limit, start, id, null, null);
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
     * Parses the API model response into this OOP lazy-fetched model+controller.
     */
    public static Merchant fromEntity(io.swagger.client.model.Member entity) {
        return new Merchant(
                entity.getId(),
                entity.getName(),
                entity.getNameLegal(),
                entity.getStreet1(),
                entity.getStreet2(),
                entity.getCity(),
                entity.getState(),
                entity.getZipcode(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getIndustry(),
                entity.getStatus(),
                entity.getCreated()
        );
    }


    /**
     * Merchant.Location OOP lazy-fetched model+controller example.
     */
    public static final class Location {
        private final String id;
        private final String membersId;
        private final String street1;
        private final String street2;
        private final String city;
        private final String state;
        private final String zipcode;
        private final Double latitude;
        private final Double longitude;
        private final String phone;
        private final String siteName;

        private Location(String id, String membersId, String street1, String street2, String city, String state, String zipcode, Double latitude, Double longitude, String phone, String siteName) {
            if (id == null || id.trim().isEmpty()) {
                throw new IllegalArgumentException("invalid id");
            }

            this.id = id;
            this.membersId = membersId;
            this.street1 = street1;
            this.street2 = street2;
            this.city = city;
            this.state = state;
            this.zipcode = zipcode;
            this.latitude = latitude;
            this.longitude = longitude;
            this.phone = phone;
            this.siteName = siteName;
        }

        public String getId() {
            return id;
        }

        public String getMembersId() {
            return membersId;
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

        public Double getLatitude() {
            return latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public String getPhone() {
            return phone;
        }

        public String getSiteName() {
            return siteName;
        }

        /**
         * @return Issues belonging to this merchant+location.
         * @throws ApiException On API call failure
         */
        public List<Issue> getIssues(Integer limit, Integer start) throws ApiException {
            List<Issue> issues = new ArrayList<Issue>();
            IssueResponse issuesResponse = ApiUtil.getIssuesApi().getIssues(limit, start, membersId, null, id);
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
         * Parses the API model response into this OOP lazy-fetched model+controller.
         */
        public static Location fromEntity(io.swagger.client.model.MemberLocation entity) {
            return new Location(
                    entity.getId(),
                    entity.getMembersId(),
                    entity.getStreet1(),
                    entity.getStreet2(),
                    entity.getCity(),
                    entity.getState(),
                    entity.getZipcode(),
                    entity.getLatitude(),
                    entity.getLongitude(),
                    entity.getPhone(),
                    entity.getSiteName()
            );
        }
    }

    /**
     * Merchant.User OOP lazy-fetched model+controller example.
     */
    public static final class User {
        private final String id;
        private final String membersId;
        private final String membersLocationsId;
        private final String firstName;
        private final String lastName;
        private final String fullName;
        private final String email;
        private final String smsNumber;
        private final String lang;
        private final String status;

        private User(String id, String membersId, String membersLocationsId, String firstName, String lastName, String fullName, String email, String smsNumber, String lang, String status) {
            if (id == null || id.trim().isEmpty()) {
                throw new IllegalArgumentException("invalid id");
            }

            this.id = id;
            this.membersId = membersId;
            this.membersLocationsId = membersLocationsId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = fullName;
            this.email = email;
            this.smsNumber = smsNumber;
            this.lang = lang;
            this.status = status;
        }

        public String getId() {
            return id;
        }

        public String getMembersId() {
            return membersId;
        }

        public String getMembersLocationsId() {
            return membersLocationsId;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFullName() {
            return fullName;
        }

        public String getEmail() {
            return email;
        }

        public String getSmsNumber() {
            return smsNumber;
        }

        public String getLang() {
            return lang;
        }

        public String getStatus() {
            return status;
        }

        /**
         * @return Issues belonging to this merchant+user.
         * @throws ApiException On API call failure
         */
        public List<Issue> getIssues(Integer limit, Integer start) throws ApiException {
            List<Issue> issues = new ArrayList<Issue>();
            IssueResponse issuesResponse = ApiUtil.getIssuesApi().getIssues(limit, start, membersId, id, null);
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
         * Parses the API model response into this OOP lazy-fetched model+controller.
         */
        public static User fromEntity(io.swagger.client.model.MemberUser entity) {
            return new User(
                    entity.getId(),
                    entity.getMembersId(),
                    entity.getMembersLocationsId(),
                    entity.getFirstName(),
                    entity.getLastName(),
                    entity.getFullName(),
                    entity.getEmail(),
                    entity.getSmsNumber(),
                    entity.getLang(),
                    entity.getStatus()
            );
        }
    }
}
