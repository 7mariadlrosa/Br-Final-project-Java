package com.ironhack.commentsservice.controller.interfaces;

import com.ironhack.commentsservice.model.Comment;

import java.util.List;

public interface ICommentController {

    List<Comment> getAllCommentByCourseId();
}
