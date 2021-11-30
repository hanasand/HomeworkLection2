package com.engeto;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Guest firstGuest = new Guest("Adéla Malíkova", LocalDate.of(1993, 3, 13));
        System.out.println(firstGuest.getDescription());

        Guest secondGuest = new Guest("Jan Dvořák", LocalDate.of(1995, 5, 5));
        System.out.println(secondGuest.getDescription());

        Room firstRoom = new Room(1, "single", true, true, 1000);
        System.out.println(firstRoom.getDescription());

        Room secondRoom = new Room(2, "single", true, true, 1000);
        System.out.println(secondRoom.getDescription());

        Room thirdRoom = new Room(3, "triple", false, true, 2400);
        System.out.println(thirdRoom.getDescription());

        Bookings bookings = new Bookings();
        Booking booking = new Booking(firstGuest, firstRoom, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfStay.HOLIDAY_STAY);
        bookings.addBooking(booking);
        booking = new Booking(firstGuest, firstRoom, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfStay.OCCUPATIONAL_STAY);
        booking.addGuest(secondGuest);
        bookings.addBooking(booking);

        bookings.printBookings();
    }

    }

