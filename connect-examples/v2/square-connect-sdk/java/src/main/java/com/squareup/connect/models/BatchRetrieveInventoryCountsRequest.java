/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@ApiModel(description = "")

public class BatchRetrieveInventoryCountsRequest {
  @JsonProperty("catalog_object_ids")
  private List<String> catalogObjectIds = new ArrayList<String>();

  @JsonProperty("location_ids")
  private List<String> locationIds = new ArrayList<String>();

  @JsonProperty("updated_after")
  private String updatedAfter = null;

  @JsonProperty("cursor")
  private String cursor = null;

  public BatchRetrieveInventoryCountsRequest catalogObjectIds(List<String> catalogObjectIds) {
    this.catalogObjectIds = catalogObjectIds;
    return this;
  }

  public BatchRetrieveInventoryCountsRequest addCatalogObjectIdsItem(String catalogObjectIdsItem) {
    this.catalogObjectIds.add(catalogObjectIdsItem);
    return this;
  }

   /**
   * Filters results by [CatalogObject](#type-catalogobject) ID. Only applied when set. Default: unset.
   * @return catalogObjectIds
  **/
  @ApiModelProperty(value = "Filters results by [CatalogObject](#type-catalogobject) ID. Only applied when set. Default: unset.")
  public List<String> getCatalogObjectIds() {
    return catalogObjectIds;
  }

  public void setCatalogObjectIds(List<String> catalogObjectIds) {
    this.catalogObjectIds = catalogObjectIds;
  }

  public BatchRetrieveInventoryCountsRequest locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public BatchRetrieveInventoryCountsRequest addLocationIdsItem(String locationIdsItem) {
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * Filters results by [Location](#type-location) ID. Only applied when set. Default: unset.
   * @return locationIds
  **/
  @ApiModelProperty(value = "Filters results by [Location](#type-location) ID. Only applied when set. Default: unset.")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public BatchRetrieveInventoryCountsRequest updatedAfter(String updatedAfter) {
    this.updatedAfter = updatedAfter;
    return this;
  }

   /**
   * Provided as an RFC 3339 timestamp. Returns results whose `calculated_at` value is after the given time. Default: UNIX epoch (`1970-01-01T00:00:00Z`).
   * @return updatedAfter
  **/
  @ApiModelProperty(value = "Provided as an RFC 3339 timestamp. Returns results whose `calculated_at` value is after the given time. Default: UNIX epoch (`1970-01-01T00:00:00Z`).")
  public String getUpdatedAfter() {
    return updatedAfter;
  }

  public void setUpdatedAfter(String updatedAfter) {
    this.updatedAfter = updatedAfter;
  }

  public BatchRetrieveInventoryCountsRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRetrieveInventoryCountsRequest batchRetrieveInventoryCountsRequest = (BatchRetrieveInventoryCountsRequest) o;
    return Objects.equals(this.catalogObjectIds, batchRetrieveInventoryCountsRequest.catalogObjectIds) &&
        Objects.equals(this.locationIds, batchRetrieveInventoryCountsRequest.locationIds) &&
        Objects.equals(this.updatedAfter, batchRetrieveInventoryCountsRequest.updatedAfter) &&
        Objects.equals(this.cursor, batchRetrieveInventoryCountsRequest.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogObjectIds, locationIds, updatedAfter, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRetrieveInventoryCountsRequest {\n");

    sb.append("    catalogObjectIds: ").append(toIndentedString(catalogObjectIds)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    updatedAfter: ").append(toIndentedString(updatedAfter)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
