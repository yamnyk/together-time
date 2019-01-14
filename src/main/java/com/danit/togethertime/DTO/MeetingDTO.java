package com.danit.togethertime.DTO;

import com.danit.togethertime.entity.MeetingEntity;
import com.danit.togethertime.utils.AppUtils;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.stream.events.Comment;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class MeetingDTO {
  private Long id;

  private String dateStart;

  private String dateEnd;

  private String duration;

  private List<UserDTO> participants = new ArrayList<>();

  private List<CommentDTO> comments = new ArrayList<>();

  public MeetingDTO(MeetingEntity meeting) {
    this.id = meeting.getMeetingId();
    this.dateStart = meeting.getDateStart().toString();
    this.dateEnd = meeting.getDateEnd().toString();
    this.duration = meeting.getDuration();
    meeting.getParticipants().forEach((participant) -> this.participants.add(new UserDTO(participant)));
    meeting.getCommentEntities().forEach((comment) -> this.comments.add(new CommentDTO(comment)));
  }
}
