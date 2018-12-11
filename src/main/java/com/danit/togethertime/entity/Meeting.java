package com.danit.togethertime.entity;

import java.sql.Timestamp;

public class Meeting {

  private long meetingId;
  private Timestamp dateStart;
  private Timestamp dateEnd;


  public long getMeetingId() {
    return meetingId;
  }

  public void setMeetingId(long meetingId) {
    this.meetingId = meetingId;
  }


  public java.sql.Timestamp getDateStart() {
    return dateStart;
  }

  public void setDateStart(java.sql.Timestamp dateStart) {
    this.dateStart = dateStart;
  }


  public java.sql.Timestamp getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(java.sql.Timestamp dateEnd) {
    this.dateEnd = dateEnd;
  }

}
