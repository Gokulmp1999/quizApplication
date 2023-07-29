package com.quizApplication.quizApplication.controller;

import com.quizApplication.quizApplication.service.QuizSerivceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizSerivceImp quizSerivceImp;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<String> create(@RequestParam String category, @RequestParam int numQ, @RequestParam String title) {
        quizSerivceImp.createQuiz(category, numQ, title);
        return new ResponseEntity<>("quiz", HttpStatus.OK);
    }
}
