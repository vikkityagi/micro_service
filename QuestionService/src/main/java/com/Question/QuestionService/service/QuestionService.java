package com.Question.QuestionService.service;

import java.util.List;

import com.Question.QuestionService.entity.Question;

public interface QuestionService {

    public Question create(Question question);
    public List<Question> list();
    public Question get(Long id);
    public List<Question> getQuestionofQuiz(long id);
    
}
