package com.Quiz.QuizService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Quiz.QuizService.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
    
}
