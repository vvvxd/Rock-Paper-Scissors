package main.java.com.vvvxd.RockPaperScissors;

import java.util.Scanner;

public class Field {
    private int choice;
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        startMenu();
        while (validateChoice(choice)) {
            choice = scanner.nextInt();
        }
        GameLogic game = new GameLogic();
        game.start(choice);
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

    public int getChoice() {
        return choice;
    }
}
