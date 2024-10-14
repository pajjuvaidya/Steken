package com.cbd.steken.controller;

import com.cbd.steken.model.Question;
import com.cbd.steken.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    //get data based on the difficulty value
    @GetMapping("difficulty/{difficultyLevel}")
    public List<Question> getAllQuestionsByDifficulty(@PathVariable String difficultyLevel){
        return questionService.getAllQuestionsByDifficulty(difficultyLevel);
    }

    @PostMapping("addquestion")
    public String addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

}
