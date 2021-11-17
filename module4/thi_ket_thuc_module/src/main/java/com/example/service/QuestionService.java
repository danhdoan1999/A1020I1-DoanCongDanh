package com.example.service;

import com.example.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionService {
Page<Question> findAll(Pageable pageable);
Question findById(Integer id);
void save(Question question);
void delete(Question question);
    Page<Question> findAllByQuestion_TittleOrQuestionType_Name(String title, String nameType, Pageable pageable);
Iterable<Question> findAll();
}
