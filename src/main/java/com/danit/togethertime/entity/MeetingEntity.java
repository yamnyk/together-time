package com.danit.togethertime.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tt_meeting")
@Data
@NoArgsConstructor
@Getter
@Setter
public class MeetingEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  @Column(name = "meetingid")
  private long meetingId;

  @Column(name = "datestart")
  private Timestamp dateStart;

  @Column(name = "dateend")
  private Timestamp dateEnd;

}
