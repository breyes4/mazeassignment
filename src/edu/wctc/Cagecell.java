package edu.wctc;

public class Cagecell extends Room implements Interactable {

    public Cagecell(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "It is very murky and quiet, you notice the cage bars are rusting but still hold a lot of firmness";
    }

    public String interact = "You see a mysterious key in one the corners, it is lettered in small words and tells you to go south.";

    @Override
    public String interact(Player player) {
        return interact;
    }

    @Override
    public Room getAdjoiningRoom(char direction) {
        if (direction == 's') {
            return new Vent("Vent");
        }
        else if (direction == 'w') {
            return new Field("Field");
        }
        return null;
    }

    @Override
    public String getExits() {
        return "south";
    }

    @Override
    public boolean isValidDirection(char direction) {
        if (direction == 's') {
            return true;
        }
        return false;
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Key with a word hint");
        player.addToScore(200);
        return "Key with a word hint";
    }
}
