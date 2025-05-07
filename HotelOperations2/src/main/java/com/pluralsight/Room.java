package com.pluralsight;

public class Room {
    int numberOfBeds;
    double price;
    boolean occupied;
    boolean dirty;

    // Constructor
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.dirty = dirty;
        this.occupied = occupied;
    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }
    public boolean isAvailable() {
        return !isDirty() && !isOccupied();
    }
    public boolean checkIn() {
       if (this.dirty || this.occupied) {
           return false;
       }
       else {
           this.occupied = true;
           this.dirty = true;
           return true;
       }
    }
    public void checkOut() {
        this.occupied = false;
    }
    public void cleanRoom() {
        this.dirty = false;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
}
