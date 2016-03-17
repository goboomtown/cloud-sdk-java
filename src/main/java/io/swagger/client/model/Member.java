package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")
public class Member   {
  
  private String id = null;
  private String name = null;
  private String nameLegal = null;
  private String street1 = null;
  private String street2 = null;
  private String city = null;
  private String state = null;
  private String zipcode = null;
  private String email = null;
  private String phone = null;
  private String industry = null;
  private String status = null;
  private Date created = null;

  
  /**
   * Primary key.
   **/
  public Member id(String id) {
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
   * Business name.
   **/
  public Member name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Business name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Business legal name.
   **/
  public Member nameLegal(String nameLegal) {
    this.nameLegal = nameLegal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business legal name.")
  @JsonProperty("name_legal")
  public String getNameLegal() {
    return nameLegal;
  }
  public void setNameLegal(String nameLegal) {
    this.nameLegal = nameLegal;
  }

  
  /**
   * Street address.
   **/
  public Member street1(String street1) {
    this.street1 = street1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Street address.")
  @JsonProperty("street_1")
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  
  /**
   * Street address continued.
   **/
  public Member street2(String street2) {
    this.street2 = street2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Street address continued.")
  @JsonProperty("street_2")
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  
  /**
   * City.
   **/
  public Member city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "City.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * State Identifier (2 char code).
   **/
  public Member state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State Identifier (2 char code).")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * Postal Code.
   **/
  public Member zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Postal Code.")
  @JsonProperty("zipcode")
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  
  /**
   * Email address.
   **/
  public Member email(String email) {
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
   * Phone number.
   **/
  public Member phone(String phone) {
    this.phone = phone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone number.")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * Industry.
   **/
  public Member industry(String industry) {
    this.industry = industry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Industry.")
  @JsonProperty("industry")
  public String getIndustry() {
    return industry;
  }
  public void setIndustry(String industry) {
    this.industry = industry;
  }

  
  /**
   * Status.
   **/
  public Member status(String status) {
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
   * Date created.
   **/
  public Member created(Date created) {
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
    Member member = (Member) o;
    return Objects.equals(this.id, member.id) &&
        Objects.equals(this.name, member.name) &&
        Objects.equals(this.nameLegal, member.nameLegal) &&
        Objects.equals(this.street1, member.street1) &&
        Objects.equals(this.street2, member.street2) &&
        Objects.equals(this.city, member.city) &&
        Objects.equals(this.state, member.state) &&
        Objects.equals(this.zipcode, member.zipcode) &&
        Objects.equals(this.email, member.email) &&
        Objects.equals(this.phone, member.phone) &&
        Objects.equals(this.industry, member.industry) &&
        Objects.equals(this.status, member.status) &&
        Objects.equals(this.created, member.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, nameLegal, street1, street2, city, state, zipcode, email, phone, industry, status, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameLegal: ").append(toIndentedString(nameLegal)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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



