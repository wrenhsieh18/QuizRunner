package com.company;

import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Quiz quiz = new Quiz();
        quiz.createBaseQuestion();
        Integer choice;

        do {
            System.out.println("Welcome to QuizRunner. Choose what you would like to do:\n1 - Start quiz\n2 - Add more questions to the quiz\n3 - Quit");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                quiz.startQuiz();
                quiz.gradeQuiz();
            } else if (choice == 2) {
                System.out.println("What kind of questions would you like to add?\n1 - Multiple choice question\n2 - Check box question\n3 - True or false question");
                Integer choiceToAdd;
                do {
                    choiceToAdd = input.nextInt();
                    if (choiceToAdd == 1) {
                        quiz.addMultipleChoice();
                    } else if (choiceToAdd == 2) {
                        quiz.addCheckBox();
                    } else if (choiceToAdd == 3) {
                        quiz.addTrueFalse();
                    } else {
                        System.out.println("Please enter a valid choice.");
                    }
                } while (choiceToAdd != 1 && choiceToAdd != 2 && choiceToAdd != 3);
            } else if (choice == 3) {
                System.out.println("Have a nice day!");
                break;
            } else {
                System.out.println("Please enter a valid choice.");
            }
        } while (true);






    }
}
