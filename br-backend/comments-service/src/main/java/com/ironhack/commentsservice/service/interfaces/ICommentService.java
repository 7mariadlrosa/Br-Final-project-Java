package com.ironhack.commentsservice.service.interfaces;

import java.util.List;
import com.ironhack.commentsservice.model.Comment;
import org.springframework.stereotype.Service;

@Service
public interface ICommentService  {

    public Comment saveComment(Comment comment);
    public List<Comment> getAllCommentByCourseId (Long id);

   // public Comment deleteComment(Long commentId);

}
