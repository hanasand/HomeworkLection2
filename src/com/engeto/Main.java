package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Guests firstGuest = new Guests ("Adéla Malíkova",LocalDate.of(1993,3, 13));
        System.out.println(firstGuest.getDescription());

        Guests secondGuest = new Guests ("Jan Dvořák", LocalDate.of(1995, 5,5));
        System.out.println(secondGuest.getDescription());

        Rooms firstRoom = new Rooms (1,"single",true, true,1000);
        System.out.println(firstRoom.getDescription());

        Rooms secondRoom = new Rooms (2,"single", true, true,1000);
        System.out.println(secondRoom.getDescription());

        Rooms thirdRoom = new Rooms(3, "triple", false, true, 2400);
        System.out.println(thirdRoom.getDescription());

        Booking firstBooking = new Booking (firstGuest.getName(),1, LocalDate.of(2021,7,19), LocalDate.of(2021,7,26));
        System.out.println(firstBooking.getDescription());

        Booking secondBooking = new Booking (firstGuest.getName(),secondGuest.getName(), 3, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14));
        System.out.println(secondBooking.getDescription2());

        ArrayList<Booking> allBookings = new ArrayList<>();

        allBookings.add(firstBooking);
        allBookings.add(secondBooking);

        System.out.println(allBookings);

        }

    }

