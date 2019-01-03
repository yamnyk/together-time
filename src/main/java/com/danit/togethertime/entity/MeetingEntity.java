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

  @OneToMany(mappedBy = "meetingLink", fetch = FetchType.EAGER)
  private List<CommentEntity> commentEntities;

  @ManyToMany
  @JoinTable(
      name = "rel_users_meetings",
      joinColumns = {@JoinColumn(name = "meetingid")},
      inverseJoinColumns = {@JoinColumn(name = "userid")}
  )
  private List<UserEntity> participants;

  public String getDuration() {
    StringBuilder sb = new StringBuilder();

    long diff = this.dateEnd.getTime() - this.dateStart.getTime();

    int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
    int diffHours = (int) (diff / (60 * 60 * 1000));
    int diffMin = (int) (diff / (60 * 1000));
    int diffSec = (int) (diff / (1000));

    sb.append(diffDays);
    sb.append("_days ");
    sb.append(diffHours);
    sb.append("_hours ");
    sb.append(diffMin);
    sb.append("_min ");
    sb.append(diffSec);
    sb.append("_sec");

    return sb.toString();
  }
}
