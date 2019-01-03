package com.danit.togethertime.DTO;

import com.danit.togethertime.entity.MeetingEntity;
import com.danit.togethertime.utils.AppUtils;
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

  private String duration;
}
