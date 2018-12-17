package com.danit.togethertime.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tt_comments")
public class Comment {

  @Id
  @Column(name = "commentid")
  private Long commentId;

  @ManyToOne
  @JoinColumn(name = "meetingid")
  private MeetingEntity meeting;

  @Column(name = "userid")
  private Long userId;

  @Column(name = "comment")
  private String comment;
}
