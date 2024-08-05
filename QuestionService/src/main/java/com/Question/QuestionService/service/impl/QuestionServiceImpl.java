package com.Question.QuestionService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Question.QuestionService.entity.Question;
import com.Question.QuestionService.repo.QuestionRepo;
import com.Question.QuestionService.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepo questionRepo;

    @Override
    public Question create(Question question) {
        // TODO Auto-generated method stub
        return this.questionRepo.save(question);
    }

    @Override
    public List<Question> list() {
        // TODO Auto-generated method stub
        return this.questionRepo.findAll();
    }

    @Override
    public Question get(Long id) {
        // TODO Auto-generated method stub
        return this.questionRepo.findById(id).orElseThrow(()->new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> getQuestionofQuiz(long id){
        return this.questionRepo.findByQuizId(id);
    }


    
}
