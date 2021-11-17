package com.example.service.impl;

import com.example.model.Question;
import com.example.repository.QuestionRepository;
import com.example.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;
    @Override
    public Page<Question> findAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Override
    public Question findById(Integer id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Question question) {
            questionRepository.save(question);
    }

    @Override
    public void delete(Question question) {
            questionRepository.delete(question);
    }

    @Override
    public Page<Question> findAllByQuestion_TittleOrQuestionType_Name(String title, String nameType, Pageable pageable) {
        return questionRepository.findAllByQuestion_TittleOrQuestionType_Name("%" + title + "%", "%" + nameType + "%" ,pageable);
    }

    @Override
    public Iterable<Question> findAll() {
        return questionRepository.findAll();
    }
}
