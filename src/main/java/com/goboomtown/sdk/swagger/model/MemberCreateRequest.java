package com.goboomtown.sdk.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.goboomtown.sdk.swagger.model.Member;
import com.goboomtown.sdk.swagger.model.MemberLocation;
import com.goboomtown.sdk.swagger.model.MemberUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-23T11:55:09.982-06:00")
public class MemberCreateRequest   {
  
  private Member members = null;
  private MemberUser membersUsers = null;
  private MemberLocation membersLocations = null;

  
  /**
   **/
  public MemberCreateRequest members(Member members) {
    this.members = members;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("members")
  public Member getMembers() {
    return members;
  }
  public void setMembers(Member members) {
    this.members = members;
  }

  
  /**
   **/
  public MemberCreateRequest membersUsers(MemberUser membersUsers) {
    this.membersUsers = membersUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("members_users")
  public MemberUser getMembersUsers() {
    return membersUsers;
  }
  public void setMembersUsers(MemberUser membersUsers) {
    this.membersUsers = membersUsers;
  }

  
  /**
   **/
  public MemberCreateRequest membersLocations(MemberLocation membersLocations) {
    this.membersLocations = membersLocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("members_locations")
  public MemberLocation getMembersLocations() {
    return membersLocations;
  }
  public void setMembersLocations(MemberLocation membersLocations) {
    this.membersLocations = membersLocations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberCreateRequest memberCreateRequest = (MemberCreateRequest) o;
    return Objects.equals(this.members, memberCreateRequest.members) &&
        Objects.equals(this.membersUsers, memberCreateRequest.membersUsers) &&
        Objects.equals(this.membersLocations, memberCreateRequest.membersLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members, membersUsers, membersLocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberCreateRequest {\n");
    
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    membersUsers: ").append(toIndentedString(membersUsers)).append("\n");
    sb.append("    membersLocations: ").append(toIndentedString(membersLocations)).append("\n");
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



