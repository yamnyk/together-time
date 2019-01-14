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

  public UserDTO(UserEntity userEntity) {
    this.id = userEntity.getUserID();
    this.firstName = userEntity.getFirstName();
    this.secondName = userEntity.getSecondName();
    this.login = userEntity.getLogin();
    this.birdthDate = this.getStringDateBirdth(userEntity.getDateOfBirth());
  }

  private String getStringDateBirdth(Timestamp dateOfBirth) {
    return String.valueOf(dateOfBirth.getYear()) + " "
        + String.valueOf(dateOfBirth.getMonth() + 1) + " "
        + String.valueOf(dateOfBirth.getDay());
  }
}
