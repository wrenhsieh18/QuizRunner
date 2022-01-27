package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Options extends Question {

    private ArrayList<String> option = new ArrayList<>();
    private static Scanner inputOption = new Scanner(System.in);

    public String getOption() {
        String output = "";
        for (String eachOption : option) {
            output += eachOption + "\n";
        }
        return output;
    }

    public void addOption(ArrayList<String> option) {
        this.option = option;
    }

    public static ArrayList<String> promptOption() {
        ArrayList<String> optionInput = new ArrayList<>();
        System.out.println("How many choices for this question? ");
        int numOfChoices = inputOption.nextInt();
        inputOption.nextLine();
        for (int i = 0; i < numOfChoices; i++) {
            System.out.print(String.format("Option no. %d: ", i+1));
            optionInput.add( String.format("%d - %s", i, inputOption.nextLine()));
        }
        return optionInput;
    }
}
