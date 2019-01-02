package com.danit.togethertime.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.stream.events.Comment;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class MeetingDTO {

  private Long id;

  private String dateStart;

  private String dateEnd;
//  private List<CommentDTO> comments;
}
