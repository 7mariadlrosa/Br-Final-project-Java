package com.ironhack.courseservice.model;

import com.ironhack.developertypeservice.model.DeveloperType;
import com.ironhack.lenguageservice.model.Lenguage;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="course")
public class Course {

/*
    id INT NOT NULL AUTO_INCREMENT,
    developer_type ENUM ('Frontend', 'Backend'),
    lenguage ENUM ('Java', 'Javascript', 'Phyton', 'CSS', 'HTML', 'Angular', 'React'),
    course_name VARCHAR(255),
    description VARCHAR(255),
    start_date DATE,
    duration INT,
*/

    @Id
    @Column(name="id")
    private Integer id;

   //OTRO MICROSERVICIO PARA DIVIDIR POR TIPO DE CURSO
    @ManyToOne
    @JoinColumn(name = "developer_type")
    private DeveloperType developerType;

   //OTRO MICROSERVICIO PARA DIVIDIR POR LENGUAJES DE PROGRAMACIÓN
    @ManyToOne
    @JoinColumn(name = "lenguage")
    private Lenguage lenguage;

    private String course_name;

    private String description;

    private Date start_date;

    //@Column(name = "duration")
    //private Integer duration;


    public Course() {
    }

    public Course(Integer id, DeveloperType developerType, Lenguage lenguage, String course_name, Date start_date, String description
                  //Integer duration
    ) {
        this.id = id;
        //this.developerType = new DeveloperType().getCourse().getDeveloperType();
        //this.lenguage = new Lenguage().getCourse().getLenguage();
        this.developerType = developerType;
        this.lenguage = lenguage;
        this.course_name = course_name;
        this.description = description;
        this.start_date = start_date;
        //this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DeveloperType getDeveloperType() {
        return developerType;
    }

    public void setDeveloperType(DeveloperType developerType){
        this.developerType = developerType;
    }

    public Lenguage getLenguage() {
        return lenguage;
    }

    public void setLenguage(Lenguage lenguage){
        this.lenguage = lenguage;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

     */
}
