package com.ironhack.commentsservice.controller.impl;

import java.util.List;

import com.ironhack.commentsservice.model.Comment;
import com.ironhack.commentsservice.service.impl.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    private static Logger logger=LoggerFactory.getLogger(CommentController.class);
    @Autowired
    CommentService commentService;

    @PostMapping("/addComment")
    public ResponseEntity<?> saveComment(@RequestBody Comment c)
    {
        ResponseEntity<?> result=null;
        try
        {
            Comment comment=commentService.saveComment(c);
            if(comment!=null)
            {
                result=ResponseEntity.status(HttpStatus.CREATED).build();
                logger.info("Comment Saved"); //SE HA CREADO PORQUE ME HA DEVUELTO EL STATUS CORRECTO
            }
            else
            {
                result=ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }
        catch(Exception e)
        {
            result=ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return result;
    }

    @GetMapping("/getComments/{id}")
    public ResponseEntity<Object> getCourseById(@PathVariable ("id") Long id)
    {

        ResponseEntity<Object> result= (ResponseEntity<Object>) commentService.getAllCommentByCourseId(id);
        try {
            List<Comment> b=commentService.getAllCommentByCourseId(id);
            result= (ResponseEntity<Object>) commentService.getAllCommentByCourseId(id); //AQUÍ PONGO QUE ME DEVUELVA EL COMENTARIO (ESTÁ BIEN?)
        }
        catch(Exception e)
        {
            result=ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return result;
    }

    /*
    @DeleteMapping("/deleteComment/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("id") Long id) {

        ResponseEntity<?> result=null;
        commentService.deleteComment(id);

        result=ResponseEntity.status(HttpStatus.OK).build();
        return result;
    }

     */

}
