package com.goboomtown.sdk.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.goboomtown.sdk.swagger.model.BaseResponse;
import com.goboomtown.sdk.swagger.model.Member;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-23T11:55:09.982-06:00")
public class MemberResponse extends BaseResponse  {
  
  private Integer pages = null;
  private Boolean success = null;
  private Date currentServerTime = null;
  private Integer totalCount = null;
  private Integer returned = null;
  private String message = null;
  private List<Member> results = new ArrayList<Member>();

  
  /**
   * Total pages available
   **/
  public MemberResponse pages(Integer pages) {
    this.pages = pages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total pages available")
  @JsonProperty("pages")
  public Integer getPages() {
    return pages;
  }
  public void setPages(Integer pages) {
    this.pages = pages;
  }

  
  /**
   * Indicates success of the operation
   **/
  public MemberResponse success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates success of the operation")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   **/
  public MemberResponse currentServerTime(Date currentServerTime) {
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
   * Total objects available
   **/
  public MemberResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total objects available")
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  
  /**
   * Total objects retrieved
   **/
  public MemberResponse returned(Integer returned) {
    this.returned = returned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total objects retrieved")
  @JsonProperty("returned")
  public Integer getReturned() {
    return returned;
  }
  public void setReturned(Integer returned) {
    this.returned = returned;
  }

  
  /**
   **/
  public MemberResponse message(String message) {
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
  public MemberResponse results(List<Member> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("results")
  public List<Member> getResults() {
    return results;
  }
  public void setResults(List<Member> results) {
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
    MemberResponse memberResponse = (MemberResponse) o;
    return Objects.equals(this.pages, memberResponse.pages) &&
        Objects.equals(this.success, memberResponse.success) &&
        Objects.equals(this.currentServerTime, memberResponse.currentServerTime) &&
        Objects.equals(this.totalCount, memberResponse.totalCount) &&
        Objects.equals(this.returned, memberResponse.returned) &&
        Objects.equals(this.message, memberResponse.message) &&
        Objects.equals(this.results, memberResponse.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages, success, currentServerTime, totalCount, returned, message, results, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberResponse {\n");
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



