package com.Quiz.QuizService.services;

import java.util.List;

import com.Quiz.QuizService.entity.Quiz;

public interface QuizService {
    
    Quiz add(Quiz quiz);

    List<Quiz> list();

    Quiz get(Long id);

    
}
