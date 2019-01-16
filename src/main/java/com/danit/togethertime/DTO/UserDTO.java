package com.danit.togethertime.DTO;

import com.danit.togethertime.entity.UserEntity;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserDTO {
  private Long id;

  private String firstName;

  private String secondName;

  private String login;

  private String birdthDate;

  private String getStringDateBirdth(Timestamp dateOfBirth) {
    return String.valueOf(dateOfBirth.getYear()) + " "
        + String.valueOf(dateOfBirth.getMonth() + 1) + " "
        + String.valueOf(dateOfBirth.getDay());
  }
}
