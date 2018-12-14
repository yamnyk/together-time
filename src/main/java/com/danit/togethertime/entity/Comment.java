package com.danit.togethertime.entity;

import javax.persistence.*;

@Entity
@Table(name = "tt_comments")
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  @Column(name = "commentid")
  private Long commentId;

  @Column(name = "meetingid")
  private Long meatingId;

  @Column(name = "userid")
  private Long userId;

  @Column(name = "comment")
  private String comment;


  public Long getCommentId() {
    return commentId;
  }

  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }


  public Long getMeatingId() {
    return meatingId;
  }

  public void setMeatingId(Long meatingId) {
    this.meatingId = meatingId;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

}
