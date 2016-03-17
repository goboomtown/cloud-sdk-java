package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")
public class IssueLog   {
  
  private String id = null;
  private String issuesId = null;
  private String diffLog = null;
  private String notes = null;
  private Date created = null;

  
  /**
   * Primary key.
   **/
  public IssueLog id(String id) {
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
   * The primary key of the related *Issue*.
   **/
  public IssueLog issuesId(String issuesId) {
    this.issuesId = issuesId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The primary key of the related *Issue*.")
  @JsonProperty("issues_id")
  public String getIssuesId() {
    return issuesId;
  }
  public void setIssuesId(String issuesId) {
    this.issuesId = issuesId;
  }

  
  /**
   * Differences.
   **/
  public IssueLog diffLog(String diffLog) {
    this.diffLog = diffLog;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Differences.")
  @JsonProperty("diff_log")
  public String getDiffLog() {
    return diffLog;
  }
  public void setDiffLog(String diffLog) {
    this.diffLog = diffLog;
  }

  
  /**
   * Notes.
   **/
  public IssueLog notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * Date created.
   **/
  public IssueLog created(Date created) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLog issueLog = (IssueLog) o;
    return Objects.equals(this.id, issueLog.id) &&
        Objects.equals(this.issuesId, issueLog.issuesId) &&
        Objects.equals(this.diffLog, issueLog.diffLog) &&
        Objects.equals(this.notes, issueLog.notes) &&
        Objects.equals(this.created, issueLog.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, issuesId, diffLog, notes, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuesId: ").append(toIndentedString(issuesId)).append("\n");
    sb.append("    diffLog: ").append(toIndentedString(diffLog)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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



