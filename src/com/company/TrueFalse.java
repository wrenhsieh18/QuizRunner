package com.company;



public class TrueFalse extends Question {

    private String answer;

    public TrueFalse(String aQuestion, String aAnswer) {
        addQuestion(aQuestion);
        answer = aAnswer;

    }

    @Override
    public String toString() {
        return String.format("%s\n1 - True\n0 - False", getQuestion());
    }

    protected String getAnswer() {
        return answer;
    }

    protected static String promptAnswer() {
        String answerByUser;
        do {
            System.out.print("The answer for this question is (Please enter a number)? ");
            answerByUser = Question.getInput().nextLine();
        } while (!answerByUser.equals("1") && !answerByUser.equals("0"));
        return answerByUser;
    }

}
