package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")
public class MemberUser   {
  
  private String id = null;
  private String membersId = null;
  private String membersLocationsId = null;
  private String firstName = null;
  private String lastName = null;
  private String fullName = null;
  private String email = null;
  private String smsNumber = null;
  private String lang = null;
  private String status = null;

  
  /**
   * Primary key.
   **/
  public MemberUser id(String id) {
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
   * The primary key of the related *Merchant*.
   **/
  public MemberUser membersId(String membersId) {
    this.membersId = membersId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The primary key of the related *Merchant*.")
  @JsonProperty("members_id")
  public String getMembersId() {
    return membersId;
  }
  public void setMembersId(String membersId) {
    this.membersId = membersId;
  }

  
  /**
   * The primary key of the related *MerchantLocation*.
   **/
  public MemberUser membersLocationsId(String membersLocationsId) {
    this.membersLocationsId = membersLocationsId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The primary key of the related *MerchantLocation*.")
  @JsonProperty("members_locations_id")
  public String getMembersLocationsId() {
    return membersLocationsId;
  }
  public void setMembersLocationsId(String membersLocationsId) {
    this.membersLocationsId = membersLocationsId;
  }

  
  /**
   * First name.
   **/
  public MemberUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "First name.")
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Last name.
   **/
  public MemberUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last name.")
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Concatenation of first and last name.
   **/
  public MemberUser fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Concatenation of first and last name.")
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   * Email address.
   **/
  public MemberUser email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Email address.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * SMS capable phone number.
   **/
  public MemberUser smsNumber(String smsNumber) {
    this.smsNumber = smsNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SMS capable phone number.")
  @JsonProperty("sms_number")
  public String getSmsNumber() {
    return smsNumber;
  }
  public void setSmsNumber(String smsNumber) {
    this.smsNumber = smsNumber;
  }

  
  /**
   * Language.
   **/
  public MemberUser lang(String lang) {
    this.lang = lang;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language.")
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }
  public void setLang(String lang) {
    this.lang = lang;
  }

  
  /**
   * Status.
   **/
  public MemberUser status(String status) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberUser memberUser = (MemberUser) o;
    return Objects.equals(this.id, memberUser.id) &&
        Objects.equals(this.membersId, memberUser.membersId) &&
        Objects.equals(this.membersLocationsId, memberUser.membersLocationsId) &&
        Objects.equals(this.firstName, memberUser.firstName) &&
        Objects.equals(this.lastName, memberUser.lastName) &&
        Objects.equals(this.fullName, memberUser.fullName) &&
        Objects.equals(this.email, memberUser.email) &&
        Objects.equals(this.smsNumber, memberUser.smsNumber) &&
        Objects.equals(this.lang, memberUser.lang) &&
        Objects.equals(this.status, memberUser.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, membersId, membersLocationsId, firstName, lastName, fullName, email, smsNumber, lang, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    membersId: ").append(toIndentedString(membersId)).append("\n");
    sb.append("    membersLocationsId: ").append(toIndentedString(membersLocationsId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    smsNumber: ").append(toIndentedString(smsNumber)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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



