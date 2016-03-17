package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")
public class MemberLocation   {
  
  private String id = null;
  private String membersId = null;
  private String street1 = null;
  private String street2 = null;
  private String city = null;
  private String state = null;
  private String zipcode = null;
  private Double latitude = null;
  private Double longitude = null;
  private String phone = null;
  private String siteName = null;

  
  /**
   * Primary key.
   **/
  public MemberLocation id(String id) {
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
  public MemberLocation membersId(String membersId) {
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
   * Street address.
   **/
  public MemberLocation street1(String street1) {
    this.street1 = street1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Street address.")
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
  public MemberLocation street2(String street2) {
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
  public MemberLocation city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "City.")
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
  public MemberLocation state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "State Identifier (2 char code).")
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
  public MemberLocation zipcode(String zipcode) {
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
   * Latitude.
   **/
  public MemberLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latitude.")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitude.
   **/
  public MemberLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Longitude.")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Phone number.
   **/
  public MemberLocation phone(String phone) {
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
   * Informal reference, an alias.
   **/
  public MemberLocation siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Informal reference, an alias.")
  @JsonProperty("site_name")
  public String getSiteName() {
    return siteName;
  }
  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberLocation memberLocation = (MemberLocation) o;
    return Objects.equals(this.id, memberLocation.id) &&
        Objects.equals(this.membersId, memberLocation.membersId) &&
        Objects.equals(this.street1, memberLocation.street1) &&
        Objects.equals(this.street2, memberLocation.street2) &&
        Objects.equals(this.city, memberLocation.city) &&
        Objects.equals(this.state, memberLocation.state) &&
        Objects.equals(this.zipcode, memberLocation.zipcode) &&
        Objects.equals(this.latitude, memberLocation.latitude) &&
        Objects.equals(this.longitude, memberLocation.longitude) &&
        Objects.equals(this.phone, memberLocation.phone) &&
        Objects.equals(this.siteName, memberLocation.siteName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, membersId, street1, street2, city, state, zipcode, latitude, longitude, phone, siteName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberLocation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    membersId: ").append(toIndentedString(membersId)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
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



