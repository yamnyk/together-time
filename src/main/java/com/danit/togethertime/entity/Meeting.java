package com.danit.togethertime.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

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

  @ManyToMany(cascade = { CascadeType.ALL })
  @JoinTable(
          name = "rel_meeting_users",
          joinColumns = { @JoinColumn(name = "meetingid") },
          inverseJoinColumns = { @JoinColumn(name = "userid") }
  )
  private List<Meeting> meetings;
  private List<User> perticipants;

  public List<User> getPerticipants() {
    return perticipants;
  }

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
