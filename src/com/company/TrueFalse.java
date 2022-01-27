package com.company;

import java.util.Scanner;

public class TrueFalse extends Question {

    private String answer;
    private static Scanner inputAnswer = new Scanner(System.in);


    public TrueFalse(String aQuestion, String aAnswer) {
        addQuestion(aQuestion);
        answer = aAnswer;

    }

    @Override
    public String toString() {
        return String.format("%s\n1 - True\n0 - False", getQuestion());
    }

    public String getAnswer() {
        return answer;
    }

    public static String promptAnswer() {
        String answerByUser;
        do {
            System.out.print("The answer for this question is (Please enter a number)? ");
            answerByUser = inputAnswer.nextLine();
        } while (!answerByUser.equals("1") && !answerByUser.equals("0"));
        return answerByUser;
    }

}
