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

    public Long getId() {
        return id;
    }

    enum QuestionType {
        STAR_RATING,
        INPUT_FIELD,
        MULTIPLE_CHOICE
    }
}
