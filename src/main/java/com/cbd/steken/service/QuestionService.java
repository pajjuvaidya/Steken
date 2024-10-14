package com.cbd.steken.service;


import com.cbd.steken.model.Question;
import com.cbd.steken.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public List<Question> getAllQuestionsByDifficulty(String difficultyLevel) {
        return  questionRepository.findByDifficultyLevelIgnoreCase(difficultyLevel);
    }

    public String addQuestion(Question question) {
        try {
            questionRepository.save(question);
            return  "row added Succesfully";
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
