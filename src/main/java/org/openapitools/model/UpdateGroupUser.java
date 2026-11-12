package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.UserGroup;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateGroupUser
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:07:14.295530+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
public class UpdateGroupUser {

  private UserGroup group;

  public UpdateGroupUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateGroupUser(UserGroup group) {
    this.group = group;
  }

  public UpdateGroupUser group(UserGroup group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @NotNull @Valid 
  @Schema(name = "group", example = "ADMIN", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("group")
  public UserGroup getGroup() {
    return group;
  }

  @JsonProperty("group")
  public void setGroup(UserGroup group) {
    this.group = group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupUser updateGroupUser = (UpdateGroupUser) o;
    return Objects.equals(this.group, updateGroupUser.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupUser {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

