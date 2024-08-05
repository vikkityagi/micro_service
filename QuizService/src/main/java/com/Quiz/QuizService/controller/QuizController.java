package com.Quiz.QuizService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Quiz.QuizService.entity.Quiz;
import com.Quiz.QuizService.services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    public Quiz addQuiz(@RequestBody Quiz quiz){
        return this.quizService.add(quiz);  
    }

    @GetMapping
    public List<Quiz> list(){
        return this.quizService.list();
    }

    @GetMapping("/{id}")
    public Quiz get(@PathVariable("id") long id){
        return this.quizService.get(id);
    }

    
}
