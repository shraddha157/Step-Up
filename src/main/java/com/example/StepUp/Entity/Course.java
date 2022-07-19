package com.example.StepUp.Entity;

//import javax.persistence.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class Course {

    @Id
    public int id;

    public String name;

//    @Column
//    public String content;

    //public int activityId;

    public ArrayList<Integer> activityIdList;

    public ArrayList<Integer> getActivityIdList() {
        return activityIdList;
    }

    public void setActivityIdList(ArrayList<Integer> activityIdList) {
        this.activityIdList = activityIdList;
    }

//    public int getActivityId() {
//        return activityId;
//    }

//    public void setActivityId(int activityId) {
//        this.activityId = activityId;
//    }

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
