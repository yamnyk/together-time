package com.danit.togethertime.DTO;

import com.danit.togethertime.entity.CommentEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommentDTO {
  private UserDTO author;

  private String message;

  public CommentDTO(CommentEntity commentEntity) {
    this.author = new UserDTO(commentEntity.getAuthor());
    this.message = commentEntity.getCommentText();
  }
}