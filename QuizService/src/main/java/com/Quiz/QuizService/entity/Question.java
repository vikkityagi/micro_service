package com.Quiz.QuizService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    
    private Long id;

    private String questionName;

    private Long quizId;
    
}

