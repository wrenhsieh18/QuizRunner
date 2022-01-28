package com.company;

import java.util.ArrayList;


public class CheckBox extends Options{

    private String answer;

    public CheckBox(String aQuestion, ArrayList<String> aOption, String aAnswer) {
        addQuestion(aQuestion);
        addOption(aOption);
        answer = aAnswer;

    }

    @Override
    public String toString() {
        return String.format("%s\n%s", getQuestion(), getOption());
    }

    protected String getAnswer() {
        return answer;
    }

    protected static String promptAnswer() {
        System.out.print("The answer for this question is (Please enter a number)? ");
        Integer answerByUser = Question.getInput().nextInt();
        //System.out.println(answerByUser.toString().replace(",", ""));
        return answerByUser.toString().replace(",", "");
    }


}
