package main.java.com.vvvxd.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private  Field field = new Field();
    private int choice;
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        startMenu();
        while (validateChoice(choice)) {
            choice = scanner.nextInt();
        }
        field.setUserChoice(getFigure(choice));
        System.out.println("User choice " + field.getUserChoice());
        field.setPcChoice(getRandomFigure());
        System.out.println("PC choice " + field.getPcChoice());
        getWinner(field.getUserChoice(), field.getPcChoice());
    }

    public int getChoice() {
        return choice;
    }

    private void startMenu() {
        System.out.println("Game Rock-Shears-Paper");
        System.out.println("Choose a figure\n");
        System.out.println("1. ROCK");
        System.out.println("2. SCISSORS");
        System.out.println("3. PAPER");
        choice = scanner.nextInt();
    }

    private boolean validateChoice(int input) {
        if (choice < 1 || choice > 3) {
            System.out.println("Your choice is wrong!");
            System.out.println("Please, choose again.");
            return true;
        }
        return false;
    }

    private void getWinner(String userChoice, String pcChoice) {
        if (userChoice.equals(pcChoice)) {
            System.out.println("Draw");
        } else if ((userChoice.equals("ROCK") && pcChoice.equals("SCISSORS")) ||
                (userChoice.equals("SCISSORS") && pcChoice.equals("PAPER")) ||
                (userChoice.equals("PAPER") && pcChoice.equals("ROCK"))) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }

    private String getRandomFigure() {
        int randomIndex = new Random().nextInt(3);
        return getFigure(randomIndex);
    }

    private String getFigure(int choice) {
        switch (choice) {
            case 1:
                return "ROCK";
            case 2:
                return "SCISSORS";
            case 3:
                return "PAPER";
            default:
                return "ROCK";
        }
    }
}
