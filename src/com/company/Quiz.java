package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
    Scanner inputQuiz = new Scanner(System.in);
    private ArrayList<MultipleChoice> multipleChoiceForQuiz = new ArrayList<>();
    private ArrayList<CheckBox> checkBoxForQuiz = new ArrayList<>();
    private ArrayList<TrueFalse> trueFalseforQuiz = new ArrayList<>();


    private ArrayList<String> userAnswers = new ArrayList<>();


    public void createBaseQuestion() {
        MultipleChoice baseQuestionForMultiple1 = new MultipleChoice("Which of the following is NOT a term for one class that extends another:", new ArrayList<>(Arrays.asList("1 - subclass", "2 - derived class", "3 - extension class", "4 - child class")), "3");

        MultipleChoice baseQuestionForMultiple2 = new MultipleChoice("A class, Greeting, extends another class, Message. By convention, how would we represent the relationship between these classes in a diagram?", new ArrayList<>(Arrays.asList("1 - two boxes with an arrow pointing from Greeting to Message", "2 - two boxes with an arrow pointing from Message to Greeting", "3 - two boxes with Greeting positioned inside of Message", "4 - two boxes with Greeting positioned directly beneath Message")), "1");

        MultipleChoice baseQuestionForMultiple3 = new MultipleChoice("When might a programmer want to make a class abstract?", new ArrayList<>(Arrays.asList("1 - When a class has no real data or behavior ", "2 - When expressionism just won't cut it ", "3 - When that class needs to be instantiated in more than one package", "4 - When shared behavior is desired among a group of non-abstract classes")), "4");

        Collections.addAll(multipleChoiceForQuiz, baseQuestionForMultiple1, baseQuestionForMultiple2, baseQuestionForMultiple3);

        CheckBox baseQuestionCheckBox1 = new CheckBox("Which city does LaunchCode provide LC101 program for? ", new ArrayList<>(Arrays.asList("1 - Chicago","2 - Saint Louis", "3 - Kansas City", "4 - Philadelphia","5 - Madison", "6 - Northwest Arkansas")), "2346");

        Collections.addAll(checkBoxForQuiz, baseQuestionCheckBox1);

        TrueFalse baseQuestionTF1 = new TrueFalse("A class derived from an abstract class must implement all of the abstract methods it inherits.", "1");
        TrueFalse baseQuestionTF2 = new TrueFalse("When making class diagrams, the main idea is to get the design rules just right so that you won’t need to update your classes in the future.", "0");
        TrueFalse baseQuestionTF3 = new TrueFalse("Launchcode is a non-profit organization? ", "1");
        TrueFalse baseQuestionTF4 = new TrueFalse("You have practiced drawing class diagram.", "1");

        Collections.addAll(trueFalseforQuiz,baseQuestionTF1,baseQuestionTF2,baseQuestionTF3,baseQuestionTF4);

    }




    //printQuestion
    public void startQuiz() {
        for (int i = 0; i < trueFalseforQuiz.size(); i++) {
            System.out.println("(Q" + (i+1) + ") " + trueFalseforQuiz.get(i).toString());

            System.out.print("Answer(enter a number): ");
            userAnswers.add(inputQuiz.nextLine());
            System.out.println("");
        }

        for (int i = 0; i < multipleChoiceForQuiz.size(); i++) {
            System.out.println("(Q" + (i+1 + trueFalseforQuiz.size()) + ") " + multipleChoiceForQuiz.get(i).toString());

            System.out.print("Answer(enter a number): ");
            userAnswers.add(inputQuiz.nextLine());
            System.out.println("");
        }

        for (int i = 0; i < checkBoxForQuiz.size(); i++) {
            System.out.println("(Q" + (i+multipleChoiceForQuiz.size()+trueFalseforQuiz.size()+1) + ") " + checkBoxForQuiz.get(i).toString());

            System.out.print("Answer(enter a number): ");
            userAnswers.add(inputQuiz.nextLine());
            System.out.println("");
        }


    }

    //grade
    public void gradeQuiz() {
        int numOfQuestion = multipleChoiceForQuiz.size() + checkBoxForQuiz.size() + trueFalseforQuiz.size();
        double pointPerQuestion = (double) 100/numOfQuestion;
        double pointEarned = 0;

        for (int i = 0; i < trueFalseforQuiz.size(); i++) {
            if (trueFalseforQuiz.get(i).getAnswer().equals(userAnswers.get(i))) {
                pointEarned += pointPerQuestion;
            }
        }

        for (int i = 0; i < multipleChoiceForQuiz.size(); i++) {
            if (multipleChoiceForQuiz.get(i).getAnswer().equals(userAnswers.get(i+trueFalseforQuiz.size()))) {
                pointEarned += pointPerQuestion;
            }
        }
        for (int i = 0; i < checkBoxForQuiz.size(); i++) {
            if (checkBoxForQuiz.get(i).getAnswer().equals(userAnswers.get(i+multipleChoiceForQuiz.size()+trueFalseforQuiz.size()))) {
                pointEarned += pointPerQuestion;
            }
        }

        if (pointEarned > 100) {
            pointEarned = 100;
        }

        System.out.println("You earned " + pointEarned + " points on this quiz.");

    }

    //addToMultipleChoice
    public void addMultipleChoice() {
        String questionInput = Question.promptQuestion();
        ArrayList<String> optionInput = Options.promptOption();
        String answerInput = MultipleChoice.promptAnswer();

        MultipleChoice singleMultipleChoiceQuestion = new MultipleChoice(questionInput, optionInput, answerInput);

        multipleChoiceForQuiz.add(singleMultipleChoiceQuestion);

    }

    //addToCheckBox
    public void addCheckBox() {
        String questionInput = Question.promptQuestion();
        ArrayList<String> optionInput = Options.promptOption();
        String answerInput = CheckBox.promptAnswer();

        CheckBox singleCheckBoxQuestion = new CheckBox(questionInput, optionInput, answerInput);

        checkBoxForQuiz.add(singleCheckBoxQuestion);

    }

    //addToCheckBox
    public void addTrueFalse() {
        String questionInput = Question.promptQuestion();
        String answerInput = TrueFalse.promptAnswer();

        TrueFalse singleTrueFalseQuestion = new TrueFalse(questionInput, answerInput);

        trueFalseforQuiz.add(singleTrueFalseQuestion);

    }

}
