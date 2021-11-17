package com.example.model;

import com.example.validate.DateOfBirth;

import javax.persistence.*;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idQuestion;

    private String tittle;
    private String question;
    private String answer;
    @ManyToOne
    @JoinColumn(name = "idQuestionType",referencedColumnName = "idQuestionType",nullable = false)
    private QuestionType questionType;

    @DateOfBirth
    private String dateCreate;
    private String statusQuestion;

    public Question() {
    }

    public Question(Integer idQuestion, String tittle, String question, String answer, String dateCreate, String statusQuestion) {
        this.idQuestion = idQuestion;
        this.tittle = tittle;
        this.question = question;
        this.answer = answer;
        this.dateCreate = dateCreate;
        this.statusQuestion = statusQuestion;
    }

    public Question(Integer idQuestion, String tittle, String question, String answer, QuestionType questionType, String dateCreate, String statusQuestion) {
        this.idQuestion = idQuestion;
        this.tittle = tittle;
        this.question = question;
        this.answer = answer;
        this.questionType = questionType;
        this.dateCreate = dateCreate;
        this.statusQuestion = statusQuestion;
    }

    public Question(Integer idQuestion, String tittle, String question, QuestionType questionType, String dateCreate) {
        this.idQuestion = idQuestion;
        this.tittle = tittle;
        this.question = question;
        this.questionType = questionType;
        this.dateCreate = dateCreate;
    }

    public Integer getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Integer idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getStatusQuestion() {
        return statusQuestion;
    }

    public void setStatusQuestion(String statusQuestion) {
        this.statusQuestion = statusQuestion;
    }
}
