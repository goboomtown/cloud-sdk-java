package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")
public class Provider   {
  
  private String id = null;
  private String name = null;
  private String nameLegal = null;
  private String nickname = null;
  private String commId = null;
  private String description = null;
  private String street1 = null;
  private String street2 = null;
  private String city = null;
  private String state = null;
  private String zipcode = null;
  private Float latitude = null;
  private Float longitude = null;
  private String defaultPartnersTeamsId = null;
  private String email = null;
  private String phone = null;
  private String website = null;
  private String avatar = null;
  private Date created = null;
  private Date updated = null;

  
  /**
   * Primary key.
   **/
  public Provider id(String id) {
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
  public Provider name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business name.")
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
  public Provider nameLegal(String nameLegal) {
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
   * Hashtag nickname for group mentions in chat.
   **/
  public Provider nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hashtag nickname for group mentions in chat.")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  
  /**
   * The communication channel id.
   **/
  public Provider commId(String commId) {
    this.commId = commId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The communication channel id.")
  @JsonProperty("comm_id")
  public String getCommId() {
    return commId;
  }
  public void setCommId(String commId) {
    this.commId = commId;
  }

  
  /**
   * Description.
   **/
  public Provider description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Street address.
   **/
  public Provider street1(String street1) {
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
  public Provider street2(String street2) {
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
  public Provider city(String city) {
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
  public Provider state(String state) {
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
  public Provider zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Postal Code.")
  @JsonProperty("zipcode")
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  
  /**
   * Business location latitude.
   **/
  public Provider latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business location latitude.")
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Business location longitude.
   **/
  public Provider longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business location longitude.")
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Default ProviderTeam's id.
   **/
  public Provider defaultPartnersTeamsId(String defaultPartnersTeamsId) {
    this.defaultPartnersTeamsId = defaultPartnersTeamsId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default ProviderTeam's id.")
  @JsonProperty("default_partners_teams_id")
  public String getDefaultPartnersTeamsId() {
    return defaultPartnersTeamsId;
  }
  public void setDefaultPartnersTeamsId(String defaultPartnersTeamsId) {
    this.defaultPartnersTeamsId = defaultPartnersTeamsId;
  }

  
  /**
   * Email address.
   **/
  public Provider email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email address.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Primary contact phone number.
   **/
  public Provider phone(String phone) {
    this.phone = phone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary contact phone number.")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * Business website/URL.
   **/
  public Provider website(String website) {
    this.website = website;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business website/URL.")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  
  /**
   * URL to an avatar.
   **/
  public Provider avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to an avatar.")
  @JsonProperty("avatar")
  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  
  /**
   * Date created.
   **/
  public Provider created(Date created) {
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

  
  /**
   * Date last updated.
   **/
  public Provider updated(Date updated) {
    this.updated = updated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date last updated.")
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Provider provider = (Provider) o;
    return Objects.equals(this.id, provider.id) &&
        Objects.equals(this.name, provider.name) &&
        Objects.equals(this.nameLegal, provider.nameLegal) &&
        Objects.equals(this.nickname, provider.nickname) &&
        Objects.equals(this.commId, provider.commId) &&
        Objects.equals(this.description, provider.description) &&
        Objects.equals(this.street1, provider.street1) &&
        Objects.equals(this.street2, provider.street2) &&
        Objects.equals(this.city, provider.city) &&
        Objects.equals(this.state, provider.state) &&
        Objects.equals(this.zipcode, provider.zipcode) &&
        Objects.equals(this.latitude, provider.latitude) &&
        Objects.equals(this.longitude, provider.longitude) &&
        Objects.equals(this.defaultPartnersTeamsId, provider.defaultPartnersTeamsId) &&
        Objects.equals(this.email, provider.email) &&
        Objects.equals(this.phone, provider.phone) &&
        Objects.equals(this.website, provider.website) &&
        Objects.equals(this.avatar, provider.avatar) &&
        Objects.equals(this.created, provider.created) &&
        Objects.equals(this.updated, provider.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, nameLegal, nickname, commId, description, street1, street2, city, state, zipcode, latitude, longitude, defaultPartnersTeamsId, email, phone, website, avatar, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameLegal: ").append(toIndentedString(nameLegal)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    commId: ").append(toIndentedString(commId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    defaultPartnersTeamsId: ").append(toIndentedString(defaultPartnersTeamsId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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



