package com.cbd.steken.model;

import jakarta.persistence.*;
import lombok.Data;

//below data is coming from lombok..
// it will avoid writing biler plate code for setter,getter,tostring etc
@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false,unique=true)
    private String questionTitle;
    @Column(nullable = false)
    private String option1;
    @Column(nullable = false)
    private String option2;
    @Column(nullable = false)
    private String option3;
    @Column(nullable = false)
    private String option4;
    @Column(nullable = false)
    private String rightAns;
    @Column(nullable = false)
    private String difficultyLevel;
}
