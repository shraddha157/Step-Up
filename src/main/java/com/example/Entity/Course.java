package com.example.Entity;

import javax.persistence.*;

@Entity
@Table(name="Course")
public class Course {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column
    public String name;

//    @Column
//    public String content;

    @Column
    public int activityId;

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
}
