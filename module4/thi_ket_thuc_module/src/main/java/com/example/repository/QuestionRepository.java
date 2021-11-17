package com.example.repository;

import com.example.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
    @Query("select q from Question q where q.tittle like ?1 or q.questionType.nameQuestionType like ?2")
    Page<Question> findAllByQuestion_TittleOrQuestionType_Name(String title, String nameType, Pageable pageable);
}
