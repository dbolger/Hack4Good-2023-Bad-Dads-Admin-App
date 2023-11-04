package com.baddads.entities.quiz;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "quizzes")
public class Quiz {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne(targetEntity = Question.class)
    private List<Question> questionList;

    public Quiz() {

    }

    public Quiz(List<Question> questionList) {
        this.questionList = questionList;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
