package com.ironhack.commentsservice.model;

import javax.persistence.*;

@Entity
@Table(name  = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String textComment;

    private Long userId; // HACER REFERENCIA AL USER LOGGEADO

    private Long courseId; // HACER REFERENCIA AL CURSO EN EL QUE SE COMENTA

    public Comment() {
    }

    public void Comments(Long id, String textComment, Long userId, Long courseId ) {
        this.id = id;
        this.textComment = textComment;
        this.userId = userId;
        this.courseId = courseId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
