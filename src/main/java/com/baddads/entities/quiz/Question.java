package com.baddads.entities.quiz;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    private @Id @GeneratedValue Long id;
    private String questionPrompt;

    Question() {

    }

    public Question(String questionPrompt) {
        this.questionPrompt = questionPrompt;
    }

    public String getQuestionPrompt() {
        return questionPrompt;
    }

    public void setQuestionPrompt(String questionPrompt) {
        this.questionPrompt = questionPrompt;
    }
}
