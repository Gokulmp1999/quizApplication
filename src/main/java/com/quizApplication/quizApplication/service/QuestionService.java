package com.quizApplication.quizApplication.service;

import com.quizApplication.quizApplication.model.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface QuestionService {
     ResponseEntity<List<Question>> getAllQuestions();
     ResponseEntity<List<Question>> getQuestionByCategory(String category);

     ResponseEntity<String> addQuestions(Question question);
}
