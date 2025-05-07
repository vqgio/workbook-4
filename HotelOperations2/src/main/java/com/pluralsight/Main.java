package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 150.00, false, true);
        System.out.println("There is a room available! : " + room1.isAvailable());
    }
}
