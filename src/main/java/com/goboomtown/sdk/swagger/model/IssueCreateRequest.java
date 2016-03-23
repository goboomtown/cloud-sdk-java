package com.goboomtown.sdk.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.goboomtown.sdk.swagger.model.Issue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-23T11:55:09.982-06:00")
public class IssueCreateRequest   {
  
  private Issue issues = null;

  
  /**
   **/
  public IssueCreateRequest issues(Issue issues) {
    this.issues = issues;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("issues")
  public Issue getIssues() {
    return issues;
  }
  public void setIssues(Issue issues) {
    this.issues = issues;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueCreateRequest issueCreateRequest = (IssueCreateRequest) o;
    return Objects.equals(this.issues, issueCreateRequest.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueCreateRequest {\n");
    
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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



