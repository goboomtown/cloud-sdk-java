package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Member;
import io.swagger.client.model.MemberLocation;
import io.swagger.client.model.MemberUser;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")
public class MemberTuple   {
  
  private Member member = null;
  private MemberUser memberUser = null;
  private MemberLocation memberLocation = null;

  
  /**
   **/
  public MemberTuple member(Member member) {
    this.member = member;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("member")
  public Member getMember() {
    return member;
  }
  public void setMember(Member member) {
    this.member = member;
  }

  
  /**
   **/
  public MemberTuple memberUser(MemberUser memberUser) {
    this.memberUser = memberUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("member_user")
  public MemberUser getMemberUser() {
    return memberUser;
  }
  public void setMemberUser(MemberUser memberUser) {
    this.memberUser = memberUser;
  }

  
  /**
   **/
  public MemberTuple memberLocation(MemberLocation memberLocation) {
    this.memberLocation = memberLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("member_location")
  public MemberLocation getMemberLocation() {
    return memberLocation;
  }
  public void setMemberLocation(MemberLocation memberLocation) {
    this.memberLocation = memberLocation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberTuple memberTuple = (MemberTuple) o;
    return Objects.equals(this.member, memberTuple.member) &&
        Objects.equals(this.memberUser, memberTuple.memberUser) &&
        Objects.equals(this.memberLocation, memberTuple.memberLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(member, memberUser, memberLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberTuple {\n");
    
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    memberUser: ").append(toIndentedString(memberUser)).append("\n");
    sb.append("    memberLocation: ").append(toIndentedString(memberLocation)).append("\n");
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



