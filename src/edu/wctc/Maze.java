package edu.wctc;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze(Player player) {
        this.player = player;
        edu.wctc.Cagecell c = new edu.wctc.Cagecell("Cagecell");
        Field f = new Field("Field");
        edu.wctc.Vent v = new edu.wctc.Vent("Vent");

        this.currentRoom = c;
    }


    public String exitCurrentRoom() {
        if (this.currentRoom.exit(this.player) != "You cannot exit from this room.") {
            this.isFinished = true;
        }
        return this.currentRoom.exit(this.player);
    }


    public String interactWithCurrentRoom() {
        if (currentRoom instanceof Interactable) {
            return ((Interactable) currentRoom).interact(player);
        } else {
            return "This room is not interactable";
        }
    }

    // A method that returns string
    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable) {
            return ((Lootable) currentRoom).loot(player);
        } else return "This room is not lootable.";
    }


    public boolean move(char direction) {
        if (this.currentRoom.isValidDirection(direction)) {
            this.currentRoom = this.currentRoom.getAdjoiningRoom(direction);
            return true;
        }
        return false;
    }

    public int getPlayerScore() {
        return this.player.getScore();
    }

    public String getPlayerInventory() {
        return this.player.getInventory();
    }


    public String getCurrentRoomDescription() {
        return this.currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return this.currentRoom.getExits();
    }

    public String getCurrentRoomName() {
        return this.currentRoom.getName();
    }

    public boolean isFinished() {
        return this.isFinished;
    }
}
