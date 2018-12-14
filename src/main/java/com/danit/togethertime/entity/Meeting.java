package com.danit.togethertime.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tt_meeting")
public class Meeting {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  @Column(name = "meetingid")
  private Long meetingId;

  @Column(name = "datestart")
  private Timestamp dateStart;

  @Column(name = "dateend")
  private Timestamp dateEnd;


  public Long getMeetingId() {
    return meetingId;
  }

  public void setMeetingId(Long meetingId) {
    this.meetingId = meetingId;
  }


  public Timestamp getDateStart() {
    return dateStart;
  }

  public void setDateStart(Timestamp dateStart) {
    this.dateStart = dateStart;
  }


  public Timestamp getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(Timestamp dateEnd) {
    this.dateEnd = dateEnd;
  }

}
