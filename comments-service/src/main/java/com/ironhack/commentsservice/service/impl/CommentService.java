package com.ironhack.commentsservice.service.impl;

import java.util.List;
import com.ironhack.commentsservice.model.Comment;


public interface CommentService {

    public Comment savecomment(Comment c);
    public List<Comment> getAllCommentByCourseId (String courseId);
    public Comment deleteComment(int commentId);
}
