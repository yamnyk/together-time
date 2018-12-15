package com.danit.togethertime.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class MeetingDTO {
  private Timestamp dateStart;
  private Timestamp dateEnd;
}
