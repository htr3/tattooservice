package com.tattooservice.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tattooservice.model.Artwork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Artist
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-31T17:12:52.178051100+05:30[Asia/Calcutta]")
public class Artist {

  private String id;

  private String name;

  private String bio;

  @Valid
  private List<@Valid Artwork> artworks;

  public Artist id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Artist name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Artist bio(String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * Get bio
   * @return bio
  */
  
  @Schema(name = "bio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bio")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public Artist artworks(List<@Valid Artwork> artworks) {
    this.artworks = artworks;
    return this;
  }

  public Artist addArtworksItem(Artwork artworksItem) {
    if (this.artworks == null) {
      this.artworks = new ArrayList<>();
    }
    this.artworks.add(artworksItem);
    return this;
  }

  /**
   * Get artworks
   * @return artworks
  */
  @Valid 
  @Schema(name = "artworks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("artworks")
  public List<@Valid Artwork> getArtworks() {
    return artworks;
  }

  public void setArtworks(List<@Valid Artwork> artworks) {
    this.artworks = artworks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artist artist = (Artist) o;
    return Objects.equals(this.id, artist.id) &&
        Objects.equals(this.name, artist.name) &&
        Objects.equals(this.bio, artist.bio) &&
        Objects.equals(this.artworks, artist.artworks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bio, artworks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artist {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    artworks: ").append(toIndentedString(artworks)).append("\n");
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

