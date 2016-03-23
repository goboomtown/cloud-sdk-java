package com.goboomtown.sdk.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-23T11:55:09.982-06:00")
public class Issue   {
  
  private String id = null;
  private String referenceNum = null;
  private String membersId = null;
  private String membersName = null;
  private String membersEmail = null;
  private String membersLocationsId = null;
  private String membersLocationsName = null;
  private String membersUsersId = null;
  private String membersUsersName = null;
  private String membersUsersEmail = null;
  private String type = null;
  private String category = null;
  private String details = null;
  private String status = null;
  private String job = null;
  private String resolution = null;
  private Date created = null;
  private Date updated = null;
  private Date scheduledTime = null;
  private Date enrouteTime = null;
  private Date arrivalTime = null;
  private Date departureTime = null;

  
  /**
   * Primary key
   **/
  public Issue id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary key")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Reference number
   **/
  public Issue referenceNum(String referenceNum) {
    this.referenceNum = referenceNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference number")
  @JsonProperty("reference_num")
  public String getReferenceNum() {
    return referenceNum;
  }
  public void setReferenceNum(String referenceNum) {
    this.referenceNum = referenceNum;
  }

  
  /**
   * Related *Merchant* primary key
   **/
  public Issue membersId(String membersId) {
    this.membersId = membersId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Related *Merchant* primary key")
  @JsonProperty("members_id")
  public String getMembersId() {
    return membersId;
  }
  public void setMembersId(String membersId) {
    this.membersId = membersId;
  }

  
  /**
   * Related *Merchant* name
   **/
  public Issue membersName(String membersName) {
    this.membersName = membersName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Related *Merchant* name")
  @JsonProperty("members_name")
  public String getMembersName() {
    return membersName;
  }
  public void setMembersName(String membersName) {
    this.membersName = membersName;
  }

  
  /**
   * Related *Merchant* email
   **/
  public Issue membersEmail(String membersEmail) {
    this.membersEmail = membersEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Related *Merchant* email")
  @JsonProperty("members_email")
  public String getMembersEmail() {
    return membersEmail;
  }
  public void setMembersEmail(String membersEmail) {
    this.membersEmail = membersEmail;
  }

  
  /**
   * Related *MerchantLocation* primary key
   **/
  public Issue membersLocationsId(String membersLocationsId) {
    this.membersLocationsId = membersLocationsId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Related *MerchantLocation* primary key")
  @JsonProperty("members_locations_id")
  public String getMembersLocationsId() {
    return membersLocationsId;
  }
  public void setMembersLocationsId(String membersLocationsId) {
    this.membersLocationsId = membersLocationsId;
  }

  
  /**
   * Related *MerchantLocation* name
   **/
  public Issue membersLocationsName(String membersLocationsName) {
    this.membersLocationsName = membersLocationsName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Related *MerchantLocation* name")
  @JsonProperty("members_locations_name")
  public String getMembersLocationsName() {
    return membersLocationsName;
  }
  public void setMembersLocationsName(String membersLocationsName) {
    this.membersLocationsName = membersLocationsName;
  }

  
  /**
   * Related *MerchantUser* primary key
   **/
  public Issue membersUsersId(String membersUsersId) {
    this.membersUsersId = membersUsersId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Related *MerchantUser* primary key")
  @JsonProperty("members_users_id")
  public String getMembersUsersId() {
    return membersUsersId;
  }
  public void setMembersUsersId(String membersUsersId) {
    this.membersUsersId = membersUsersId;
  }

  
  /**
   * Related *MerchantUser* name
   **/
  public Issue membersUsersName(String membersUsersName) {
    this.membersUsersName = membersUsersName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Related *MerchantUser* name")
  @JsonProperty("members_users_name")
  public String getMembersUsersName() {
    return membersUsersName;
  }
  public void setMembersUsersName(String membersUsersName) {
    this.membersUsersName = membersUsersName;
  }

  
  /**
   * Related *MerchantUser* email
   **/
  public Issue membersUsersEmail(String membersUsersEmail) {
    this.membersUsersEmail = membersUsersEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Related *MerchantUser* email")
  @JsonProperty("members_users_email")
  public String getMembersUsersEmail() {
    return membersUsersEmail;
  }
  public void setMembersUsersEmail(String membersUsersEmail) {
    this.membersUsersEmail = membersUsersEmail;
  }

  
  /**
   * Type
   **/
  public Issue type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Category
   **/
  public Issue category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * Details
   **/
  public Issue details(String details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  
  /**
   * Status
   **/
  public Issue status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Job type
   **/
  public Issue job(String job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Job type")
  @JsonProperty("job")
  public String getJob() {
    return job;
  }
  public void setJob(String job) {
    this.job = job;
  }

  
  /**
   * Resolution
   **/
  public Issue resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resolution")
  @JsonProperty("resolution")
  public String getResolution() {
    return resolution;
  }
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  
  /**
   * Created
   **/
  public Issue created(Date created) {
    this.created = created;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Created")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  
  /**
   * Updated
   **/
  public Issue updated(Date updated) {
    this.updated = updated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Updated")
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  
  /**
   * Technician job scheduled
   **/
  public Issue scheduledTime(Date scheduledTime) {
    this.scheduledTime = scheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Technician job scheduled")
  @JsonProperty("scheduled_time")
  public Date getScheduledTime() {
    return scheduledTime;
  }
  public void setScheduledTime(Date scheduledTime) {
    this.scheduledTime = scheduledTime;
  }

  
  /**
   * Technician en-route for job
   **/
  public Issue enrouteTime(Date enrouteTime) {
    this.enrouteTime = enrouteTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Technician en-route for job")
  @JsonProperty("enroute_time")
  public Date getEnrouteTime() {
    return enrouteTime;
  }
  public void setEnrouteTime(Date enrouteTime) {
    this.enrouteTime = enrouteTime;
  }

  
  /**
   * Technician arrived at job
   **/
  public Issue arrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Technician arrived at job")
  @JsonProperty("arrival_time")
  public Date getArrivalTime() {
    return arrivalTime;
  }
  public void setArrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  
  /**
   * Technician departed job
   **/
  public Issue departureTime(Date departureTime) {
    this.departureTime = departureTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Technician departed job")
  @JsonProperty("departure_time")
  public Date getDepartureTime() {
    return departureTime;
  }
  public void setDepartureTime(Date departureTime) {
    this.departureTime = departureTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issue issue = (Issue) o;
    return Objects.equals(this.id, issue.id) &&
        Objects.equals(this.referenceNum, issue.referenceNum) &&
        Objects.equals(this.membersId, issue.membersId) &&
        Objects.equals(this.membersName, issue.membersName) &&
        Objects.equals(this.membersEmail, issue.membersEmail) &&
        Objects.equals(this.membersLocationsId, issue.membersLocationsId) &&
        Objects.equals(this.membersLocationsName, issue.membersLocationsName) &&
        Objects.equals(this.membersUsersId, issue.membersUsersId) &&
        Objects.equals(this.membersUsersName, issue.membersUsersName) &&
        Objects.equals(this.membersUsersEmail, issue.membersUsersEmail) &&
        Objects.equals(this.type, issue.type) &&
        Objects.equals(this.category, issue.category) &&
        Objects.equals(this.details, issue.details) &&
        Objects.equals(this.status, issue.status) &&
        Objects.equals(this.job, issue.job) &&
        Objects.equals(this.resolution, issue.resolution) &&
        Objects.equals(this.created, issue.created) &&
        Objects.equals(this.updated, issue.updated) &&
        Objects.equals(this.scheduledTime, issue.scheduledTime) &&
        Objects.equals(this.enrouteTime, issue.enrouteTime) &&
        Objects.equals(this.arrivalTime, issue.arrivalTime) &&
        Objects.equals(this.departureTime, issue.departureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceNum, membersId, membersName, membersEmail, membersLocationsId, membersLocationsName, membersUsersId, membersUsersName, membersUsersEmail, type, category, details, status, job, resolution, created, updated, scheduledTime, enrouteTime, arrivalTime, departureTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceNum: ").append(toIndentedString(referenceNum)).append("\n");
    sb.append("    membersId: ").append(toIndentedString(membersId)).append("\n");
    sb.append("    membersName: ").append(toIndentedString(membersName)).append("\n");
    sb.append("    membersEmail: ").append(toIndentedString(membersEmail)).append("\n");
    sb.append("    membersLocationsId: ").append(toIndentedString(membersLocationsId)).append("\n");
    sb.append("    membersLocationsName: ").append(toIndentedString(membersLocationsName)).append("\n");
    sb.append("    membersUsersId: ").append(toIndentedString(membersUsersId)).append("\n");
    sb.append("    membersUsersName: ").append(toIndentedString(membersUsersName)).append("\n");
    sb.append("    membersUsersEmail: ").append(toIndentedString(membersUsersEmail)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
    sb.append("    enrouteTime: ").append(toIndentedString(enrouteTime)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



