package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() {
        Room room  = new Room(2, 100, true, false );

        boolean checkInSuccessful = room.checkIn();

        assertFalse(checkInSuccessful);
    }

    @Test
    void checkOut() {
    }

    @Test
    void cleanRoom() {
    }
}