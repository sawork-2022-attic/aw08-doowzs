package edu.nju.sa2022.micropos.delivery.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeliveryDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-09T16:50:10.605550+08:00[Asia/Shanghai]")
public class DeliveryDto   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("orderId")
  private String orderId;

  @JsonProperty("delivered")
  private Boolean delivered;

  public DeliveryDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeliveryDto orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public DeliveryDto delivered(Boolean delivered) {
    this.delivered = delivered;
    return this;
  }

  /**
   * Get delivered
   * @return delivered
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getDelivered() {
    return delivered;
  }

  public void setDelivered(Boolean delivered) {
    this.delivered = delivered;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDto delivery = (DeliveryDto) o;
    return Objects.equals(this.id, delivery.id) &&
        Objects.equals(this.orderId, delivery.orderId) &&
        Objects.equals(this.delivered, delivery.delivered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, delivered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

