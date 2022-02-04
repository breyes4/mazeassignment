package edu.wctc;

public interface Lootable {
    // Contains method named "loot" that takes a Player object as an argument and returns a String.
    // String character is going to be displayed to the Player after they loot the Room.
    public String loot(Player player);
}