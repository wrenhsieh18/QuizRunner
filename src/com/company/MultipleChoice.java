package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Options {

    private String answer;
    private static Scanner inputAnswer = new Scanner(System.in);


    public MultipleChoice(String aQuestion, ArrayList<String> aOption, String aAnswer) {
        addQuestion(aQuestion);
        addOption(aOption);
        answer = aAnswer;

    }

    @Override
    public String toString() {
        return String.format("%s\n%s", getQuestion(), getOption());
    }

    public String getAnswer() {
        return answer;
    }

    public static String promptAnswer() {
        String answerByUser;
        do {
            System.out.print("The answer for this question is (Please enter a number)? ");
            answerByUser = inputAnswer.nextLine();
        } while (answerByUser.length() != 1);
        return answerByUser;
    }

}
