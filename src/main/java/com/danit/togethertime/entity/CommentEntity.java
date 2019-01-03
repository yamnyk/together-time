package com.danit.togethertime.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tt_comments")
public class CommentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "commentid")
  private Long commentId;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="userid", nullable=false)
  private UserEntity author;

  @Column(name = "commenttext")
  private String commentText;

  @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  @JoinColumn(name="c_meetingid", nullable=false)
  private MeetingEntity meetingLink;
}