package com.quizApplication.quizApplication.controller;

import com.quizApplication.quizApplication.model.Question;
import com.quizApplication.quizApplication.service.QuestionService;
import com.quizApplication.quizApplication.service.QuestionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionServiceImp questionService;

    @RequestMapping(value = "getAllQuestions", method = RequestMethod.GET)
    public ResponseEntity<List<Question>> getAllQuestion() {
        return questionService.getAllQuestions();
    }

    @RequestMapping(value = "category/{category}", method = RequestMethod.GET)
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }
    @RequestMapping(value = "addQuestions",method = RequestMethod.POST)
    public ResponseEntity<String> addQueations(@RequestBody Question question){
        return questionService.addQuestions(question);
    }
}
