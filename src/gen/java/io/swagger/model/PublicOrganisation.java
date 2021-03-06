package io.swagger.model;

import io.swagger.model.Location;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonldType("http://data.europa.eu/m8g/PublicOrganisation")
public class PublicOrganisation  {
  
  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private Location spatial = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PublicOrganisation id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get spatial
   * @return spatial
  **/
  @JsonProperty("spatial")
  public Location getSpatial() {
    return spatial;
  }

  public void setSpatial(Location spatial) {
    this.spatial = spatial;
  }

  public PublicOrganisation spatial(Location spatial) {
    this.spatial = spatial;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicOrganisation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spatial: ").append(toIndentedString(spatial)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

