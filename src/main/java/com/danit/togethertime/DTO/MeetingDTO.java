package com.danit.togethertime.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.stream.events.Comment;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
public class MeetingDTO {
  private Timestamp dateStart;
  private Timestamp dateEnd;
  private List<CommentDTO> comments;
}
