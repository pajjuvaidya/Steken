package com.cbd.steken.repository;

import com.cbd.steken.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {

    List<Question> findByDifficultyLevelIgnoreCase(String difficultyLevel);
}
