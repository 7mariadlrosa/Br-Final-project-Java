package com.ironhack.commentsservice.repository;

import com.ironhack.commentsservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    public List<Comment> findByCourseId(String courseId);
    public Comment deleteByCommentId(int commentId);
}
