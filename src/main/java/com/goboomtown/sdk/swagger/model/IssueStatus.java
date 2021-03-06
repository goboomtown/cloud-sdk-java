package com.goboomtown.sdk.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-23T11:55:09.982-06:00")
public class IssueStatus   {
  
  private Date created = null;
  private String type = null;
  private String status = null;
  private String resolution = null;
  private Date scheduledTime = null;
  private String ticketSummaryText = null;
  private String historySummaryText = null;

  
  /**
   * Created
   **/
  public IssueStatus created(Date created) {
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
   * Type
   **/
  public IssueStatus type(String type) {
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
   * Status
   **/
  public IssueStatus status(String status) {
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
   * Resolution
   **/
  public IssueStatus resolution(String resolution) {
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
   * Technician job scheduled
   **/
  public IssueStatus scheduledTime(Date scheduledTime) {
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
   * State description
   **/
  public IssueStatus ticketSummaryText(String ticketSummaryText) {
    this.ticketSummaryText = ticketSummaryText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State description")
  @JsonProperty("ticketSummaryText")
  public String getTicketSummaryText() {
    return ticketSummaryText;
  }
  public void setTicketSummaryText(String ticketSummaryText) {
    this.ticketSummaryText = ticketSummaryText;
  }

  
  /**
   * Event/trigger description
   **/
  public IssueStatus historySummaryText(String historySummaryText) {
    this.historySummaryText = historySummaryText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event/trigger description")
  @JsonProperty("historySummaryText")
  public String getHistorySummaryText() {
    return historySummaryText;
  }
  public void setHistorySummaryText(String historySummaryText) {
    this.historySummaryText = historySummaryText;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueStatus issueStatus = (IssueStatus) o;
    return Objects.equals(this.created, issueStatus.created) &&
        Objects.equals(this.type, issueStatus.type) &&
        Objects.equals(this.status, issueStatus.status) &&
        Objects.equals(this.resolution, issueStatus.resolution) &&
        Objects.equals(this.scheduledTime, issueStatus.scheduledTime) &&
        Objects.equals(this.ticketSummaryText, issueStatus.ticketSummaryText) &&
        Objects.equals(this.historySummaryText, issueStatus.historySummaryText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, type, status, resolution, scheduledTime, ticketSummaryText, historySummaryText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueStatus {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
    sb.append("    ticketSummaryText: ").append(toIndentedString(ticketSummaryText)).append("\n");
    sb.append("    historySummaryText: ").append(toIndentedString(historySummaryText)).append("\n");
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



