package com.danit.togethertime.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
  private Long id;

  private String firstName;

  private String secondName;

  private Boolean gender;

  private String login;

  private Date birdthDate;
}
