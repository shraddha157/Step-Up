package com.example.StepUp.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MultipleChoice {

    @Id
    public int id;

    public String question;

    public String[] options;

    public int[] correctInd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int[] getCorrectInd() {
        return correctInd;
    }

    public void setCorrectInd(int[] correctInd) {
        this.correctInd = correctInd;
    }
}
