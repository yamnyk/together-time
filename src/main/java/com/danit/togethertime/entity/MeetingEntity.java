package com.danit.togethertime.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tt_meeting")
public class MeetingEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  @Column(name = "meetingid")
  private long meetingId;

  @Column(name = "datestart")
  private Timestamp dateStart;

  @Column(name = "dateend")
  private Timestamp dateEnd;

  @OneToMany(mappedBy = "meetingLink", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
  private List<CommentEntity> commentEntities;

  @ManyToMany
  @JoinTable(
      name = "rel_users_meetings",
      joinColumns = {@JoinColumn(name = "meetingid")},
      inverseJoinColumns = {@JoinColumn(name = "userid")}
  )
  private List<UserEntity> participants;

  public String getDuration() {
    int diffDays = this.dateEnd.getDay() - this.dateStart.getDay();
    int diffHours = this.dateEnd.getHours() - this.dateStart.getHours();
    int diffMin = this.dateEnd.getMinutes() - this.dateStart.getMinutes();
    int diffSec = this.dateEnd.getSeconds() - this.dateStart.getSeconds();

    return String.valueOf(diffDays) +
        "-days_" +
        diffHours +
        "-hours_" +
        diffMin +
        "-min_" +
        diffSec +
        "-sec";
  }
}
