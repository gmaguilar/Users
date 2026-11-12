package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateQtyWasted
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:07:14.295530+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
public class UpdateQtyWasted {

  private Float qtyWasted;

  public UpdateQtyWasted() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateQtyWasted(Float qtyWasted) {
    this.qtyWasted = qtyWasted;
  }

  public UpdateQtyWasted qtyWasted(Float qtyWasted) {
    this.qtyWasted = qtyWasted;
    return this;
  }

  /**
   * Get qtyWasted
   * @return qtyWasted
   */
  @NotNull 
  @Schema(name = "qtyWasted", example = "250.0", requiredMode = Schema.RequiredMode.REQUIRED)
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
    UpdateQtyWasted updateQtyWasted = (UpdateQtyWasted) o;
    return Objects.equals(this.qtyWasted, updateQtyWasted.qtyWasted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtyWasted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateQtyWasted {\n");
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

