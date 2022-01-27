package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Options{

    private String answer;
    private static Scanner inputAnswer = new Scanner(System.in);

    public CheckBox(String aQuestion, ArrayList<String> aOption, String aAnswer) {
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
        System.out.print("The answer for this question is (Please enter a number)? ");
        Integer answerByUser = inputAnswer.nextInt();
        //System.out.println(answerByUser.toString().replace(",", ""));
        return answerByUser.toString().replace(",", "");
    }


}
