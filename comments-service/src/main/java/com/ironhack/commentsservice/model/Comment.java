package com.ironhack.commentsservice.model;

import javax.persistence.Table;

@Table(name  = "comment")
public class Comment {
    private int id;
    private String text_comment;

    private String user_id; //NO SÉ COMO HACER REFERENCIA AL USER LOGGEADO

    private String course_id;

    public Comment() {
    }

    public void Comments(int commentId, String text_comment, String user_id) {
        this.id = id;
        this.text_comment = text_comment;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText_comment() {
        return text_comment;
    }

    public void setText_comment(String text_comment) {
        this.text_comment = text_comment;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }
}
