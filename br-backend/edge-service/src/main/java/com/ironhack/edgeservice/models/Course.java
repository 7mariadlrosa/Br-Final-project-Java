package com.ironhack.edgeservice.models;


import com.ironhack.edgeservice.enums.DeveloperType;
import com.ironhack.edgeservice.enums.Lenguage;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PONER EN TODOS ID
    @Column(name="id")
    private Long id;

   @Enumerated(EnumType.STRING)
    private DeveloperType developerType;

    @Enumerated(EnumType.STRING)
    private Lenguage lenguage;

    private String courseName;

    private String description;

    private Date startDate;

    //@Column(name = "duration")
    //private Integer duration;


    public Course() {
    }

    public Course(Long id, DeveloperType developerType, Lenguage lenguage, String courseName, Date startDate, String description
                  //Integer duration
    ) {
        this.id = id;
        this.developerType = developerType;
        this.lenguage = lenguage;
        this.courseName = courseName;
        this.description = description;
        this.startDate = startDate;
        //this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
