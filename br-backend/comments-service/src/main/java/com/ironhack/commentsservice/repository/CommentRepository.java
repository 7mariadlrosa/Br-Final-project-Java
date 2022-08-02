package com.ironhack.commentsservice.repository;

import com.ironhack.commentsservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    //public Comment deleteByCommentId(Long id);

    List<Comment> findByCourseId(Long courseId);
}
