package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 150.00, false, true);
        System.out.println("There is a room available! : " + room1.isAvailable());

        Reservation reservation1 = new Reservation("king", 3, true);
        System.out.println("Total cost for reservation: $" + reservation1.getReservationTotal());

        Employee employee1 = new Employee(177, "Johnny", "Janitor", 18.00, 52);
        System.out.println("Total pay this week is: $" + employee1.getTotalPay());
    }
}
