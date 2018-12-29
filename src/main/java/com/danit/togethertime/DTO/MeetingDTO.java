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
  @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private Date dateStart;

  @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private Date dateEnd;
//  private List<CommentDTO> comments;
}
