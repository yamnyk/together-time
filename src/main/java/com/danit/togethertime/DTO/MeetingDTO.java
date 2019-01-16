package com.danit.togethertime.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class MeetingDTO {
  private Long id;

  private String dateStart;

  private String dateEnd;

  private String duration;

  private List<UserDTO> participants;

  private List<CommentDTO> comments;
}
