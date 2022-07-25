package com.ironhack.lenguageservice.model;

import com.ironhack.courseservice.model.Course;

import javax.persistence.*;

@Entity
@Table(name="lenguage")
public class Lenguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lenguage_id")
    private Lenguage lenguage;

    /*
    @OneToMany(mappedBy = "lenguage")
    private Course course;
*/

    public Lenguage() {
    }

    public Lenguage(Long id, Lenguage lenguage, Course course) {
        this.id = id;
        this.lenguage = lenguage;
        //this.course = course;
    }

    public Lenguage( Lenguage lenguage) {
        this.lenguage = lenguage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Lenguage getLenguage() {
        return lenguage;
    }

    public void setLenguage(Lenguage lenguage) {
        this.lenguage = lenguage;
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
