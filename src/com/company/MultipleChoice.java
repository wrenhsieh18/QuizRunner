package com.company;


import java.util.ArrayList;

public class MultipleChoice extends Options {

    private String answer;

    public MultipleChoice(String aQuestion, ArrayList<String> aOption, String aAnswer) {
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
        String answerByUser;
        do {
            System.out.print("The answer for this question is (Please enter a number)? ");
            answerByUser = Question.getInput().nextLine();
        } while (answerByUser.length() != 1);
        return answerByUser;
    }

}
