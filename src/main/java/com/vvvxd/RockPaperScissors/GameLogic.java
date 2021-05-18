package main.java.com.vvvxd.RockPaperScissors;

import java.util.Random;

public class GameLogic {
    private String userChoice;
    private String pcChoice;

    public void start(int choice) {
        userChoice = getFigure(choice);
        System.out.println("User choice " + userChoice);
        pcChoice = getRandomFigure();
        System.out.println("PC choice " + pcChoice);
        getWinner(userChoice, pcChoice);
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

    public String getUserChoice() {
        return userChoice;
    }

    public String getPcChoice() {
        return pcChoice;
    }
}
