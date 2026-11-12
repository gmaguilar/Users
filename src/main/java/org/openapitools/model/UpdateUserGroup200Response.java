package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * UpdateUserGroup200Response
 */

@JsonTypeName("updateUserGroup_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:07:14.295530+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
public class UpdateUserGroup200Response {

  private @Nullable UserGroup group;

  public UpdateUserGroup200Response group(@Nullable UserGroup group) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserGroup200Response updateUserGroup200Response = (UpdateUserGroup200Response) o;
    return Objects.equals(this.group, updateUserGroup200Response.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserGroup200Response {\n");
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

