package com.Quiz.QuizService.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Quiz.QuizService.entity.Question;

@FeignClient(name="QuestionService")
public interface QuestionClient {

    @GetMapping("/question/quiz/{id}")
    public List<Question> questionOfQuiz(@PathVariable Long id);
    
}
