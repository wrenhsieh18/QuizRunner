package com.company;


import java.util.Scanner;

public abstract class Question {

    private String question;
    private static Scanner inputQuestion = new Scanner(System.in);


    public void addQuestion(String question) {
        this.question = question;
    }

    public static String promptQuestion() {
        System.out.println("What is the question? ");
        return inputQuestion.nextLine();
    }

    public String getQuestion() {
        return question;
    }
}

