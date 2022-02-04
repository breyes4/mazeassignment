package edu.wctc;

public abstract class Room implements Lootable, Interactable, Exit {
    // abstract class with strings and rooms
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();
    public abstract Room getAdjoiningRoom(char direction);
    public abstract String getExits();


    public String getName() {
        return this.name;
    }

    public abstract boolean isValidDirection(char direction);

    public void setDown() {
        this.down = down;
    }

    public void setEast() {
        this.east = east;
    }

    public void setNorth(Field v) {
        this.north = north;
    }

    public void setSouth(edu.wctc.Cagecell c) {
        this.south = south;
    }

    public void setUp() {
        this.up = up;
    }

    public void setWest() {
        this.west = west;
    }


    public String exit(Player player) {
        return "You cannot exit from this room.";
    }


}