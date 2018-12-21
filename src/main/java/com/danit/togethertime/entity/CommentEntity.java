package com.danit.togethertime.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tt_comments")
public class CommentEntity {
  @Id
  @Column(name = "commentid")
  private Long commentId;

  @Column(name = "userid")
  private UserEntity author;

  @Column(name = "commenttext")
  private String commentText;

  @ManyToOne
  @JoinColumn(name="c_meetingid", nullable=false)
  private MeetingEntity meetingLink;

  @Override
  public String toString() {
    return this.commentText;
  }
}

