package com.ironhack.commentsservice.service.impl;

import ch.qos.logback.classic.Logger;
import java.util.List;

import com.ironhack.commentsservice.model.Comment;
import com.ironhack.commentsservice.repository.CommentRepository;
import com.ironhack.commentsservice.service.interfaces.ICommentService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService implements ICommentService {

    private static Logger logger= (Logger) LoggerFactory.getLogger(ICommentService.class);
    @Autowired
    CommentRepository commentRepository;

    @Override
    public Comment saveComment(Comment c) {
        return commentRepository.save(c);
    }


    /*
    @Override
    public Comment deleteComment(Long id) {
        Comment comment = null;
        try {

            comment =commentRepository.deleteByCommentId(id);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return comment;
    }

     */

    public List<Comment> getAllCommentByCourseId(Long id) {
        return null;
    }
}
