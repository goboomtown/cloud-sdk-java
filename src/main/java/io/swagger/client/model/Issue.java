package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")
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
  private Date enrouteTime = null;
  private Date scheduledTime = null;
  private Date arrivalTime = null;
  private Date departureTime = null;

  
  /**
   * Primary key.
   **/
  public Issue id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary key.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Reference number.
   **/
  public Issue referenceNum(String referenceNum) {
    this.referenceNum = referenceNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference number.")
  @JsonProperty("reference_num")
  public String getReferenceNum() {
    return referenceNum;
  }
  public void setReferenceNum(String referenceNum) {
    this.referenceNum = referenceNum;
  }

  
  /**
   * The primary key of the related *Merchant*.
   **/
  public Issue membersId(String membersId) {
    this.membersId = membersId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The primary key of the related *Merchant*.")
  @JsonProperty("members_id")
  public String getMembersId() {
    return membersId;
  }
  public void setMembersId(String membersId) {
    this.membersId = membersId;
  }

  
  /**
   **/
  public Issue membersName(String membersName) {
    this.membersName = membersName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("members_name")
  public String getMembersName() {
    return membersName;
  }
  public void setMembersName(String membersName) {
    this.membersName = membersName;
  }

  
  /**
   **/
  public Issue membersEmail(String membersEmail) {
    this.membersEmail = membersEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("members_email")
  public String getMembersEmail() {
    return membersEmail;
  }
  public void setMembersEmail(String membersEmail) {
    this.membersEmail = membersEmail;
  }

  
  /**
   * The primary key of the related *MerchantLocation*.
   **/
  public Issue membersLocationsId(String membersLocationsId) {
    this.membersLocationsId = membersLocationsId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The primary key of the related *MerchantLocation*.")
  @JsonProperty("members_locations_id")
  public String getMembersLocationsId() {
    return membersLocationsId;
  }
  public void setMembersLocationsId(String membersLocationsId) {
    this.membersLocationsId = membersLocationsId;
  }

  
  /**
   **/
  public Issue membersLocationsName(String membersLocationsName) {
    this.membersLocationsName = membersLocationsName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("members_locations_name")
  public String getMembersLocationsName() {
    return membersLocationsName;
  }
  public void setMembersLocationsName(String membersLocationsName) {
    this.membersLocationsName = membersLocationsName;
  }

  
  /**
   * The primary key of the related *MerchantUser*.
   **/
  public Issue membersUsersId(String membersUsersId) {
    this.membersUsersId = membersUsersId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The primary key of the related *MerchantUser*.")
  @JsonProperty("members_users_id")
  public String getMembersUsersId() {
    return membersUsersId;
  }
  public void setMembersUsersId(String membersUsersId) {
    this.membersUsersId = membersUsersId;
  }

  
  /**
   **/
  public Issue membersUsersName(String membersUsersName) {
    this.membersUsersName = membersUsersName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("members_users_name")
  public String getMembersUsersName() {
    return membersUsersName;
  }
  public void setMembersUsersName(String membersUsersName) {
    this.membersUsersName = membersUsersName;
  }

  
  /**
   **/
  public Issue membersUsersEmail(String membersUsersEmail) {
    this.membersUsersEmail = membersUsersEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("members_users_email")
  public String getMembersUsersEmail() {
    return membersUsersEmail;
  }
  public void setMembersUsersEmail(String membersUsersEmail) {
    this.membersUsersEmail = membersUsersEmail;
  }

  
  /**
   * Type.
   **/
  public Issue type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Category.
   **/
  public Issue category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category.")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * Details.
   **/
  public Issue details(String details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details.")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  
  /**
   * Status.
   **/
  public Issue status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Job type.
   **/
  public Issue job(String job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Job type.")
  @JsonProperty("job")
  public String getJob() {
    return job;
  }
  public void setJob(String job) {
    this.job = job;
  }

  
  /**
   * Resolution type.
   **/
  public Issue resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resolution type.")
  @JsonProperty("resolution")
  public String getResolution() {
    return resolution;
  }
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  
  /**
   * Date created.
   **/
  public Issue created(Date created) {
    this.created = created;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date created.")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  
  /**
   * Date last updated.
   **/
  public Issue updated(Date updated) {
    this.updated = updated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date last updated.")
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  
  /**
   * Actual technician travel time.
   **/
  public Issue enrouteTime(Date enrouteTime) {
    this.enrouteTime = enrouteTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actual technician travel time.")
  @JsonProperty("enroute_time")
  public Date getEnrouteTime() {
    return enrouteTime;
  }
  public void setEnrouteTime(Date enrouteTime) {
    this.enrouteTime = enrouteTime;
  }

  
  /**
   * Date/time scheduled.
   **/
  public Issue scheduledTime(Date scheduledTime) {
    this.scheduledTime = scheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date/time scheduled.")
  @JsonProperty("scheduled_time")
  public Date getScheduledTime() {
    return scheduledTime;
  }
  public void setScheduledTime(Date scheduledTime) {
    this.scheduledTime = scheduledTime;
  }

  
  /**
   * Technician arrival time.
   **/
  public Issue arrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Technician arrival time.")
  @JsonProperty("arrival_time")
  public Date getArrivalTime() {
    return arrivalTime;
  }
  public void setArrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  
  /**
   * Technician departure time.
   **/
  public Issue departureTime(Date departureTime) {
    this.departureTime = departureTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Technician departure time.")
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
        Objects.equals(this.enrouteTime, issue.enrouteTime) &&
        Objects.equals(this.scheduledTime, issue.scheduledTime) &&
        Objects.equals(this.arrivalTime, issue.arrivalTime) &&
        Objects.equals(this.departureTime, issue.departureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceNum, membersId, membersName, membersEmail, membersLocationsId, membersLocationsName, membersUsersId, membersUsersName, membersUsersEmail, type, category, details, status, job, resolution, created, updated, enrouteTime, scheduledTime, arrivalTime, departureTime);
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
    sb.append("    enrouteTime: ").append(toIndentedString(enrouteTime)).append("\n");
    sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
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



