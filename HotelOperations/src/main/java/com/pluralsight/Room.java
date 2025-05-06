package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }
    public void checkIn() {
        if (!isAvailable()) {
            System.out.println("Room is available for check in!");
            return;
        }
        occupied = true;
        dirty = true;
        System.out.println("Sorry, Guest is currently in room.");
    }
    public void checkOut() {
        if (!occupied) {
            System.out.println("Room is already empty.");
            return;
        }
        occupied = false;
        System.out.println("Guest has checked out but room isn't clean.");
    }
    public void cleanRoom() {
        if (!occupied && dirty) {
            dirty = false;
            System.out.println("Room is cleaned");
        } else {
            System.out.println("Room is clean or occupied");
        }
    }

//    public int getNumberOfBeds() {
//        return numberOfBeds;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public boolean isOccupied() {
//        return occupied;
//    }
//
//    public boolean isDirty() {
//        return dirty;
//    }
    // as long as not occupied and not dirty it will be available
    public boolean isAvailable() {
        return !occupied && !dirty;
    }
}
