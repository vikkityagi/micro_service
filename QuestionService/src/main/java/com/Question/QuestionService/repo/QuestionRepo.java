package com.Question.QuestionService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Question.QuestionService.entity.Question;

public interface QuestionRepo extends JpaRepository<Question,Long> {

    List<Question> findByQuizId(long id);
    
}
