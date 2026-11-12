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
 * UpdateUserQtyWasted200Response
 */

@JsonTypeName("updateUserQtyWasted_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:07:14.295530+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
public class UpdateUserQtyWasted200Response {

  private @Nullable Float qtyWasted;

  public UpdateUserQtyWasted200Response qtyWasted(@Nullable Float qtyWasted) {
    this.qtyWasted = qtyWasted;
    return this;
  }

  /**
   * Get qtyWasted
   * @return qtyWasted
   */
  
  @Schema(name = "qtyWasted", example = "500.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qtyWasted")
  public @Nullable Float getQtyWasted() {
    return qtyWasted;
  }

  @JsonProperty("qtyWasted")
  public void setQtyWasted(@Nullable Float qtyWasted) {
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
    UpdateUserQtyWasted200Response updateUserQtyWasted200Response = (UpdateUserQtyWasted200Response) o;
    return Objects.equals(this.qtyWasted, updateUserQtyWasted200Response.qtyWasted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtyWasted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserQtyWasted200Response {\n");
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

