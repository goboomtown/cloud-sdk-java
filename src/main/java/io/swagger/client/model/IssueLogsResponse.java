package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BaseResponse;
import io.swagger.client.model.IssueLog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")
public class IssueLogsResponse extends BaseResponse  {
  
  private Integer pages = null;
  private Boolean success = null;
  private Date currentServerTime = null;
  private Integer totalCount = null;
  private Integer returned = null;
  private String message = null;
  private List<IssueLog> results = new ArrayList<IssueLog>();

  
  /**
   * Total pages available.
   **/
  public IssueLogsResponse pages(Integer pages) {
    this.pages = pages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total pages available.")
  @JsonProperty("pages")
  public Integer getPages() {
    return pages;
  }
  public void setPages(Integer pages) {
    this.pages = pages;
  }

  
  /**
   * Indicates success of the operation.
   **/
  public IssueLogsResponse success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates success of the operation.")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   **/
  public IssueLogsResponse currentServerTime(Date currentServerTime) {
    this.currentServerTime = currentServerTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("current_server_time")
  public Date getCurrentServerTime() {
    return currentServerTime;
  }
  public void setCurrentServerTime(Date currentServerTime) {
    this.currentServerTime = currentServerTime;
  }

  
  /**
   * Total records available.
   **/
  public IssueLogsResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total records available.")
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  
  /**
   * Total records retrieved.
   **/
  public IssueLogsResponse returned(Integer returned) {
    this.returned = returned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total records retrieved.")
  @JsonProperty("returned")
  public Integer getReturned() {
    return returned;
  }
  public void setReturned(Integer returned) {
    this.returned = returned;
  }

  
  /**
   **/
  public IssueLogsResponse message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  public IssueLogsResponse results(List<IssueLog> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("results")
  public List<IssueLog> getResults() {
    return results;
  }
  public void setResults(List<IssueLog> results) {
    this.results = results;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLogsResponse issueLogsResponse = (IssueLogsResponse) o;
    return Objects.equals(this.pages, issueLogsResponse.pages) &&
        Objects.equals(this.success, issueLogsResponse.success) &&
        Objects.equals(this.currentServerTime, issueLogsResponse.currentServerTime) &&
        Objects.equals(this.totalCount, issueLogsResponse.totalCount) &&
        Objects.equals(this.returned, issueLogsResponse.returned) &&
        Objects.equals(this.message, issueLogsResponse.message) &&
        Objects.equals(this.results, issueLogsResponse.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages, success, currentServerTime, totalCount, returned, message, results, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLogsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    currentServerTime: ").append(toIndentedString(currentServerTime)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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



