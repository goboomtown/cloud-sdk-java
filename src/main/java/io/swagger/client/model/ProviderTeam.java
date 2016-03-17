package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")
public class ProviderTeam   {
  
  private String id = null;
  private String name = null;
  private String nickname = null;
  private String description = null;
  private String email = null;
  private String phone = null;
  private String avatar = null;
  private Boolean autoAssignRoute = null;
  private Boolean autoAssignSponsor = null;
  private String status = null;
  private String type = null;
  private Boolean exclusive = null;
  private Boolean published = null;
  private String publishedName = null;
  private Boolean privateLabel = null;
  private String brandColor1 = null;
  private String brandLogo1x = null;
  private String brandLogo2x = null;
  private String brandLogo3x = null;
  private String supportEmail = null;
  private String supportPhone = null;
  private String supportUrl = null;
  private Date created = null;
  private Date updated = null;

  
  /**
   * Primary key.
   **/
  public ProviderTeam id(String id) {
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
   * Name.
   **/
  public ProviderTeam name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Hashtag nickname for group mentions in chat.
   **/
  public ProviderTeam nickname(String nickname) {
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
   * Description.
   **/
  public ProviderTeam description(String description) {
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
   * Email address.
   **/
  public ProviderTeam email(String email) {
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
  public ProviderTeam phone(String phone) {
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
   * URL to an avatar.
   **/
  public ProviderTeam avatar(String avatar) {
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
   * Automatically routes related merchant issues to this ProviderTeam.
   **/
  public ProviderTeam autoAssignRoute(Boolean autoAssignRoute) {
    this.autoAssignRoute = autoAssignRoute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Automatically routes related merchant issues to this ProviderTeam.")
  @JsonProperty("auto_assign_route")
  public Boolean getAutoAssignRoute() {
    return autoAssignRoute;
  }
  public void setAutoAssignRoute(Boolean autoAssignRoute) {
    this.autoAssignRoute = autoAssignRoute;
  }

  
  /**
   * Automatically assigns this ProviderTeam as the sponsor for related merchants.
   **/
  public ProviderTeam autoAssignSponsor(Boolean autoAssignSponsor) {
    this.autoAssignSponsor = autoAssignSponsor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Automatically assigns this ProviderTeam as the sponsor for related merchants.")
  @JsonProperty("auto_assign_sponsor")
  public Boolean getAutoAssignSponsor() {
    return autoAssignSponsor;
  }
  public void setAutoAssignSponsor(Boolean autoAssignSponsor) {
    this.autoAssignSponsor = autoAssignSponsor;
  }

  
  /**
   * Status.
   **/
  public ProviderTeam status(String status) {
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
   * Type / Category.
   **/
  public ProviderTeam type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type / Category.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Exclusive within it's type / category.
   **/
  public ProviderTeam exclusive(Boolean exclusive) {
    this.exclusive = exclusive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exclusive within it's type / category.")
  @JsonProperty("exclusive")
  public Boolean getExclusive() {
    return exclusive;
  }
  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }

  
  /**
   * Published to the Connect App.
   **/
  public ProviderTeam published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Published to the Connect App.")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * Name, as publushed in the Connect App.
   **/
  public ProviderTeam publishedName(String publishedName) {
    this.publishedName = publishedName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name, as publushed in the Connect App.")
  @JsonProperty("published_name")
  public String getPublishedName() {
    return publishedName;
  }
  public void setPublishedName(String publishedName) {
    this.publishedName = publishedName;
  }

  
  /**
   * Enable private label branding.
   **/
  public ProviderTeam privateLabel(Boolean privateLabel) {
    this.privateLabel = privateLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Enable private label branding.")
  @JsonProperty("private_label")
  public Boolean getPrivateLabel() {
    return privateLabel;
  }
  public void setPrivateLabel(Boolean privateLabel) {
    this.privateLabel = privateLabel;
  }

  
  /**
   * Private label brand color, used if private_label is true.
   **/
  public ProviderTeam brandColor1(String brandColor1) {
    this.brandColor1 = brandColor1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Private label brand color, used if private_label is true.")
  @JsonProperty("brand_color1")
  public String getBrandColor1() {
    return brandColor1;
  }
  public void setBrandColor1(String brandColor1) {
    this.brandColor1 = brandColor1;
  }

  
  /**
   * Private label logo, used if private_label is true.
   **/
  public ProviderTeam brandLogo1x(String brandLogo1x) {
    this.brandLogo1x = brandLogo1x;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Private label logo, used if private_label is true.")
  @JsonProperty("brand_logo_1x")
  public String getBrandLogo1x() {
    return brandLogo1x;
  }
  public void setBrandLogo1x(String brandLogo1x) {
    this.brandLogo1x = brandLogo1x;
  }

  
  /**
   * Private label logo (x2), used if private_label is true.
   **/
  public ProviderTeam brandLogo2x(String brandLogo2x) {
    this.brandLogo2x = brandLogo2x;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Private label logo (x2), used if private_label is true.")
  @JsonProperty("brand_logo_2x")
  public String getBrandLogo2x() {
    return brandLogo2x;
  }
  public void setBrandLogo2x(String brandLogo2x) {
    this.brandLogo2x = brandLogo2x;
  }

  
  /**
   * Private label logo (x3), used if private_label is true.
   **/
  public ProviderTeam brandLogo3x(String brandLogo3x) {
    this.brandLogo3x = brandLogo3x;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Private label logo (x3), used if private_label is true.")
  @JsonProperty("brand_logo_3x")
  public String getBrandLogo3x() {
    return brandLogo3x;
  }
  public void setBrandLogo3x(String brandLogo3x) {
    this.brandLogo3x = brandLogo3x;
  }

  
  /**
   * Primary support email address.
   **/
  public ProviderTeam supportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary support email address.")
  @JsonProperty("support_email")
  public String getSupportEmail() {
    return supportEmail;
  }
  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }

  
  /**
   * Primary support phone number.
   **/
  public ProviderTeam supportPhone(String supportPhone) {
    this.supportPhone = supportPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary support phone number.")
  @JsonProperty("support_phone")
  public String getSupportPhone() {
    return supportPhone;
  }
  public void setSupportPhone(String supportPhone) {
    this.supportPhone = supportPhone;
  }

  
  /**
   * Primary support website.
   **/
  public ProviderTeam supportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary support website.")
  @JsonProperty("support_url")
  public String getSupportUrl() {
    return supportUrl;
  }
  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
  }

  
  /**
   * Date created.
   **/
  public ProviderTeam created(Date created) {
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
  public ProviderTeam updated(Date updated) {
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
    ProviderTeam providerTeam = (ProviderTeam) o;
    return Objects.equals(this.id, providerTeam.id) &&
        Objects.equals(this.name, providerTeam.name) &&
        Objects.equals(this.nickname, providerTeam.nickname) &&
        Objects.equals(this.description, providerTeam.description) &&
        Objects.equals(this.email, providerTeam.email) &&
        Objects.equals(this.phone, providerTeam.phone) &&
        Objects.equals(this.avatar, providerTeam.avatar) &&
        Objects.equals(this.autoAssignRoute, providerTeam.autoAssignRoute) &&
        Objects.equals(this.autoAssignSponsor, providerTeam.autoAssignSponsor) &&
        Objects.equals(this.status, providerTeam.status) &&
        Objects.equals(this.type, providerTeam.type) &&
        Objects.equals(this.exclusive, providerTeam.exclusive) &&
        Objects.equals(this.published, providerTeam.published) &&
        Objects.equals(this.publishedName, providerTeam.publishedName) &&
        Objects.equals(this.privateLabel, providerTeam.privateLabel) &&
        Objects.equals(this.brandColor1, providerTeam.brandColor1) &&
        Objects.equals(this.brandLogo1x, providerTeam.brandLogo1x) &&
        Objects.equals(this.brandLogo2x, providerTeam.brandLogo2x) &&
        Objects.equals(this.brandLogo3x, providerTeam.brandLogo3x) &&
        Objects.equals(this.supportEmail, providerTeam.supportEmail) &&
        Objects.equals(this.supportPhone, providerTeam.supportPhone) &&
        Objects.equals(this.supportUrl, providerTeam.supportUrl) &&
        Objects.equals(this.created, providerTeam.created) &&
        Objects.equals(this.updated, providerTeam.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, nickname, description, email, phone, avatar, autoAssignRoute, autoAssignSponsor, status, type, exclusive, published, publishedName, privateLabel, brandColor1, brandLogo1x, brandLogo2x, brandLogo3x, supportEmail, supportPhone, supportUrl, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderTeam {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    autoAssignRoute: ").append(toIndentedString(autoAssignRoute)).append("\n");
    sb.append("    autoAssignSponsor: ").append(toIndentedString(autoAssignSponsor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    publishedName: ").append(toIndentedString(publishedName)).append("\n");
    sb.append("    privateLabel: ").append(toIndentedString(privateLabel)).append("\n");
    sb.append("    brandColor1: ").append(toIndentedString(brandColor1)).append("\n");
    sb.append("    brandLogo1x: ").append(toIndentedString(brandLogo1x)).append("\n");
    sb.append("    brandLogo2x: ").append(toIndentedString(brandLogo2x)).append("\n");
    sb.append("    brandLogo3x: ").append(toIndentedString(brandLogo3x)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    supportPhone: ").append(toIndentedString(supportPhone)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
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



