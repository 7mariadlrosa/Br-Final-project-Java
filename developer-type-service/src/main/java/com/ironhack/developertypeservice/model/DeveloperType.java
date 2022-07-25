package com.ironhack.developertypeservice.model;

import com.ironhack.courseservice.model.Course;

import javax.persistence.*;

@Entity
@Table(name="developer_type")
public class DeveloperType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "developer_type_id")
    private DeveloperType developerType;

    /*
    @OneToMany(mappedBy = "developerType")
    private Course course;
     */

    public DeveloperType() {
    }

    public DeveloperType(Long id, DeveloperType developerType, Course course) {
        this.id = id;
        this.developerType = developerType;
        //this.course = course;
    }

    public DeveloperType(DeveloperType developerType) {
        this.developerType = developerType;
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

    public void setDeveloperType(DeveloperType developerType) {
        this.developerType = developerType;
    }

    /*
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
     */

}
