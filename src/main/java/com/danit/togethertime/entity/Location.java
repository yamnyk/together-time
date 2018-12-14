package com.danit.togethertime.entity;


import javax.persistence.*;

@Entity
@Table(name = "tt_locations")
public class Location {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  @Column(name = "locationid")
  private Long locationId;

  @Column(name = "locationname")
  private String locationName;

  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }
}
