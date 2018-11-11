/*
 * sport-restful-backend
 * Sport App Backend For Android Course
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResponseFailCodes;
import io.swagger.client.model.ResponseStatuses;
import java.io.IOException;

/**
 * FailResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-11T23:17:53.916+08:00")
public class FailResponse {
  @SerializedName("status")
  private ResponseStatuses status = null;

  @SerializedName("code")
  private ResponseFailCodes code = null;

  @SerializedName("data")
  private Object data = null;

  @SerializedName("message")
  private String message = null;

  public FailResponse status(ResponseStatuses status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public ResponseStatuses getStatus() {
    return status;
  }

  public void setStatus(ResponseStatuses status) {
    this.status = status;
  }

  public FailResponse code(ResponseFailCodes code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public ResponseFailCodes getCode() {
    return code;
  }

  public void setCode(ResponseFailCodes code) {
    this.code = code;
  }

  public FailResponse data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public FailResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailResponse failResponse = (FailResponse) o;
    return Objects.equals(this.status, failResponse.status) &&
        Objects.equals(this.code, failResponse.code) &&
        Objects.equals(this.data, failResponse.data) &&
        Objects.equals(this.message, failResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, data, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

