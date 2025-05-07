package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() {
       Room room = new Room(2, 150.00);

       room.checkIn();

       assertTrue(room.isOccupied());
       assertTrue(room.isDirty());
    }

    @Test
    void checkOut() {
    }

    @Test
    void cleanRoom() {
    }
}