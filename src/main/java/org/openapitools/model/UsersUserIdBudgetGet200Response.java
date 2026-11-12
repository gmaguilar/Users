package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UsersUserIdBudgetGet200Response
 */

@JsonTypeName("_users__userId__budget_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:07:14.295530+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
public class UsersUserIdBudgetGet200Response {

  private @Nullable Float budget;

  public UsersUserIdBudgetGet200Response budget(@Nullable Float budget) {
    this.budget = budget;
    return this;
  }

  /**
   * Get budget
   * @return budget
   */
  
  @Schema(name = "budget", example = "1000.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget")
  public @Nullable Float getBudget() {
    return budget;
  }

  @JsonProperty("budget")
  public void setBudget(@Nullable Float budget) {
    this.budget = budget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersUserIdBudgetGet200Response usersUserIdBudgetGet200Response = (UsersUserIdBudgetGet200Response) o;
    return Objects.equals(this.budget, usersUserIdBudgetGet200Response.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersUserIdBudgetGet200Response {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
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

