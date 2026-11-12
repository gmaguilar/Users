package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.model.UserGroup;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:07:14.295530+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
public class User {

  private UUID userId;

  private String name;

  private String surname;

  private String email;

  private String password;

  private @Nullable UserGroup group;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;

  private Float budget;

  private Float qtyWasted;

  public User() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public User(UUID userId, String name, String surname, String email, String password, OffsetDateTime creationDate, Float budget, Float qtyWasted) {
    this.userId = userId;
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.password = password;
    this.creationDate = creationDate;
    this.budget = budget;
    this.qtyWasted = qtyWasted;
  }

  public User userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @NotNull @Valid 
  @Schema(name = "userId", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "John", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public User surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
   */
  @NotNull 
  @Schema(name = "surname", example = "Doe", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("surname")
  public String getSurname() {
    return surname;
  }

  @JsonProperty("surname")
  public void setSurname(String surname) {
    this.surname = surname;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "john.doe@example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @NotNull 
  @Schema(name = "password", example = "securepassword123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }

  public User group(@Nullable UserGroup group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @Valid 
  @Schema(name = "group", example = "ADMIN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public @Nullable UserGroup getGroup() {
    return group;
  }

  @JsonProperty("group")
  public void setGroup(@Nullable UserGroup group) {
    this.group = group;
  }

  public User creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @NotNull @Valid 
  @Schema(name = "creationDate", example = "2024-06-05T12:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creationDate")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  @JsonProperty("creationDate")
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public User budget(Float budget) {
    this.budget = budget;
    return this;
  }

  /**
   * Get budget
   * @return budget
   */
  @NotNull 
  @Schema(name = "budget", example = "1000.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("budget")
  public Float getBudget() {
    return budget;
  }

  @JsonProperty("budget")
  public void setBudget(Float budget) {
    this.budget = budget;
  }

  public User qtyWasted(Float qtyWasted) {
    this.qtyWasted = qtyWasted;
    return this;
  }

  /**
   * Get qtyWasted
   * @return qtyWasted
   */
  @NotNull 
  @Schema(name = "qtyWasted", example = "500.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("qtyWasted")
  public Float getQtyWasted() {
    return qtyWasted;
  }

  @JsonProperty("qtyWasted")
  public void setQtyWasted(Float qtyWasted) {
    this.qtyWasted = qtyWasted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.surname, user.surname) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.group, user.group) &&
        Objects.equals(this.creationDate, user.creationDate) &&
        Objects.equals(this.budget, user.budget) &&
        Objects.equals(this.qtyWasted, user.qtyWasted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, name, surname, email, password, group, creationDate, budget, qtyWasted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    qtyWasted: ").append(toIndentedString(qtyWasted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

