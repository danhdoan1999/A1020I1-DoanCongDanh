package com.example.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idQuestionType;

    @NotBlank
    private String nameQuestionType;

    @OneToMany(mappedBy = "questionType" ,cascade = CascadeType.ALL)
    Set<Question> questions;

    public QuestionType() {
    }

    public QuestionType(Integer idQuestionType, @NotBlank String nameQuestionType, Set<Question> questions) {
        this.idQuestionType = idQuestionType;
        this.nameQuestionType = nameQuestionType;
        this.questions = questions;
    }

    public Integer getIdQuestionType() {
        return idQuestionType;
    }

    public void setIdQuestionType(Integer idQuestionType) {
        this.idQuestionType = idQuestionType;
    }

    public String getNameQuestionType() {
        return nameQuestionType;
    }

    public void setNameQuestionType(String nameQuestionType) {
        this.nameQuestionType = nameQuestionType;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }
}
