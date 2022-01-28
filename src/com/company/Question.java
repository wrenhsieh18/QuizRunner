package com.company;
import java.util.Scanner;

public abstract class Question {

    private String question;
    private static final Scanner input = new Scanner(System.in);

    protected void addQuestion(String question) {
        this.question = question;
    }

    protected static String promptQuestion() {
        System.out.println("What is the question? ");
        return input.nextLine();
    }

    protected String getQuestion() {
        return question;
    }

    protected static Scanner getInput() {
        return input;
    }
}

