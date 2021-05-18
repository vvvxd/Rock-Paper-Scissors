package main.java.com.vvvxd.RockPaperScissors;

import java.util.Scanner;

public class Field {
    private String userChoice;
    private String pcChoice;

    public void setUserChoice(String userChoice) {
        this.userChoice = userChoice;
    }

    public void setPcChoice(String pcChoice) {
        this.pcChoice = pcChoice;
    }

    public String getUserChoice() {
        return userChoice;
    }

    public String getPcChoice() {
        return pcChoice;
    }
}
