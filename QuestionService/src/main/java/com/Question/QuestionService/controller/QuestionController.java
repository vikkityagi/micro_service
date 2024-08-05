package com.Question.QuestionService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Question.QuestionService.entity.Question;
import com.Question.QuestionService.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question crate(@RequestBody Question question){
        return this.questionService.create(question);
    }

    @GetMapping
    public List<Question> list(){
        return this.questionService.list();
    }

    @GetMapping("/{id}")
    public Question get(@PathVariable Long id){
        return this.questionService.get(id);
    }

    @GetMapping("/quiz/{id}")
    public List<Question> getQuiz(@PathVariable long id){
        return this.questionService.getQuestionofQuiz(id);
    }
    

    
}
