package com.company;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        quiz.createBaseQuestion();
        quiz.startQuiz();
        quiz.gradeQuiz();


    }
}
