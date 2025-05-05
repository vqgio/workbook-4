package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double pricePerNight;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend, double pricePerNight) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.pricePerNight = pricePerNight;
        //create a method to calculate price for night
    }
    private void setPricePerNight() {
        if(roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            pricePerNight = 124.00;
        }
        if (isWeekend) {
            pricePerNight *= 1.10; //use this to increase price by 10%
        }
    }
    public String getRoomType() {
        return roomType;
    }
    public voie setRoomType(String roomType) {
        this.roomType = roomType;
        setPricePerNight();
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
        setPricePerNight();
    }
    public double getReservationTotal() {
        return pricePerNight * numberOfNights;
    }
}
