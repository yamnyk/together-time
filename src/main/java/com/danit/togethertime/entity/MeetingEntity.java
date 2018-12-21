package com.danit.togethertime.entity;

import lombok.Data;
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

  @OneToMany(mappedBy = "meetingLink", cascade = CascadeType.ALL)
  private List<CommentEntity> commentEntities;

}