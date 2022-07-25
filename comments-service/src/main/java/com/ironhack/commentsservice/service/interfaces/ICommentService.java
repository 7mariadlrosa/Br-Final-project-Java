package com.ironhack.commentsservice.service.interfaces;

package com.example.service;

import java.util.List;
import java.util.logging.Logger;

import com.ironhack.commentsservice.model.Comment;
import com.ironhack.commentsservice.repository.CommentRepository;
import com.ironhack.commentsservice.service.impl.CommentService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public abstract class ICommentService implements CommentService {
    private static Logger logger= (Logger) LoggerFactory.getLogger(ICommentService.class);
    @Autowired
    CommentRepository fr;

    @Override
    public Comment savecomment(Comment c) {

        return fr.save(c);
    }


    @Override
    public List<Comment> getAllCommentByCourseId(String courseId) {

        List<Comment> o=fr.findByCourseId(courseId);

        if(!o.isEmpty())
        {
            return o;
        }
        return null;
    }


    @Override
    public Comment deleteComment(int commentId) {
        Comment fa = null;
        try {

            fa =fr.deleteByCommentId(commentId);

        }
        catch(Exception e)
        {
            logger.error();
        }
        return fa;
    }

}
