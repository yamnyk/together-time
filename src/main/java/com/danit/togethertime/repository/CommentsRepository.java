package com.danit.togethertime.repository;

import com.danit.togethertime.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comment, Long> {
}
