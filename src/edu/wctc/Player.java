package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score;
    // List of strings called inventory
    ArrayList<String> inventory = new ArrayList<>();

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void addToScore(int points) {
        this.score += points;
    }

    public String getInventory() {
        if (this.inventory.size() == 0) {
            return "Your inventory is empty.";
        } else {
            var inventoryString = String.join(",", this.inventory);
            return "You are carrying: " + inventoryString;
        }
    }

    // getScore is a method that returns the players score field
    public int getScore() {
        return this.score;
    }
}
