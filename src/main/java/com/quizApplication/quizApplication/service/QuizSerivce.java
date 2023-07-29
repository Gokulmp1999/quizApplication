package com.quizApplication.quizApplication.service;

import org.springframework.http.ResponseEntity;

public interface QuizSerivce {
    ResponseEntity<String> createQuiz(String category, int numq, String title);
}
