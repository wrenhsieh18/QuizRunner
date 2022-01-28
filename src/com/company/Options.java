package com.company;

import java.util.ArrayList;

public abstract class Options extends Question {

    private ArrayList<String> option = new ArrayList<>();

    protected String getOption() {
        String output = "";
        for (String eachOption : option) {
            output += (eachOption + "\n");
        }
        return output;
    }

    protected void addOption(ArrayList<String> option) {
        this.option = option;
    }

    protected static ArrayList<String> promptOption() {
        ArrayList<String> optionInput = new ArrayList<>();
        System.out.println("How many choices for this question? ");
        int numOfChoices = Question.getInput().nextInt();
        Question.getInput().nextLine();
        for (int i = 0; i < numOfChoices; i++) {
            System.out.print(String.format("Option no. %d: ", i+1));
            optionInput.add(String.format("%d - %s", (i+1), Question.getInput().nextLine()));
        }
        return optionInput;
    }
}
