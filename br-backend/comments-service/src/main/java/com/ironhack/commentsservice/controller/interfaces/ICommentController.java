package com.ironhack.commentsservice.controller.interfaces;

import com.ironhack.commentsservice.model.Comment;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface ICommentController {

    List<Comment> getAllCommentByCourseId();
}
