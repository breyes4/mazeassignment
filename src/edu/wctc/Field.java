package edu.wctc;

public class Field extends Room implements Interactable {

    public Field(String name) {
        super(name);
    }
    public String name = "The Field";

    @Override
    public String getDescription() {
        return "You have entered a huge and scary field out in the open. Any possible human contact or life is miles away.";
    }

    @Override
    public Room getAdjoiningRoom(char direction) {
        return null;
    }

    public String interact = "As you are running through the endless fields you find an energy boost coin.";


    @Override
    public String getExits() {
        return "north and east";
    }

    @Override
    public boolean isValidDirection(char direction) {
        if (direction == 'n' || direction == 'e') {
            return true;
        }
        return false;
    }

    @Override
    public String interact(Player player) {
        player.addToInventory("Energy Boost Coin");
        player.addToScore(100);
        return "For hours you run, and run and try to find anything in the vastness of that field, eventually you give up...";
    }

    @Override
    public String loot(Player player) {
        return null;
    }
}
