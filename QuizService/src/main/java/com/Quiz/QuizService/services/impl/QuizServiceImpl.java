package com.Quiz.QuizService.services.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Quiz.QuizService.entity.Quiz;
import com.Quiz.QuizService.repositories.QuizRepository;
import com.Quiz.QuizService.services.QuestionClient;
import com.Quiz.QuizService.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

    
    private QuizRepository quizRepository;

    
    private QuestionClient questionClient;

    

    public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        // TODO Auto-generated method stub

        return this.quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> list() {
        // TODO Auto-generated method stub
        List<Quiz> newQuizlist = this.quizRepository.findAll().stream().map(quiz -> {
            quiz.setQuestion(questionClient.questionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return newQuizlist;
    }

    @Override
    public Quiz get(Long id) {
        // TODO Auto-generated method stub
        Quiz quiz = this.quizRepository.findById(id).get();
        quiz.setQuestion(questionClient.questionOfQuiz(quiz.getId()));

        return quiz;
    }

}
