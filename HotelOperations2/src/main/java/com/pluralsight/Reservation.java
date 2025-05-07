package com.pluralsight;

public class Reservation {
    String roomType; // "king" or "double"
    int numberOfNights;
    boolean isWeekend;

    // Constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    // Getters and Setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public double getPrice() {
        double basePrice = 0.0;

        // Set base price according to room type
        if (roomType.equals("king")) {
            basePrice = 139.00;
        } else if (roomType.equals("double")) {
            basePrice = 124.00;
        }

        // Apply 10% increase for weekend stays
        if (isWeekend) {
            basePrice = basePrice * 1.10;
        }

        return basePrice;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
    public double getReservationTotal() {
        double total = getPrice() * numberOfNights;
        return total;
    }
}
