package com.quizApplication.quizApplication.service;

import com.quizApplication.quizApplication.dao.QuestionDao;
import com.quizApplication.quizApplication.dao.QuizDao;
import com.quizApplication.quizApplication.model.Question;
import com.quizApplication.quizApplication.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizSerivceImp implements QuizSerivce{
    @Autowired
    QuestionDao questionDao;
    @Autowired
    QuizDao quizDao;
    @Override
    public ResponseEntity<String> createQuiz(String category, int numq, String title) {
        List<Question> questions=questionDao.findRandomQuestionsByCategory(category,numq);
        System.out.println(questions);
        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setCategory(category);
        quizDao.save(quiz);

        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
