package com.engeto;

import java.time.LocalDate;

public class Booking {
    private int roomNumber;
    private LocalDate longOfStayFrom;
    private LocalDate longOfStayUntil;
    private String name1;
    private String name2;
    TypeOfStay typeOfStay;

    public Booking(String name1, int roomNumber, LocalDate longOfStayFrom,LocalDate longOfStayUntil) {
        this.name1 = name1;
        this.roomNumber = roomNumber;
        this.longOfStayFrom = longOfStayFrom;
        this.longOfStayUntil = longOfStayUntil;
    }

    public Booking(String name1, String name2, int roomNumber, LocalDate longOfStayFrom,LocalDate longOfStayUntil) {
        this.name1 = name1;
        this.name2 = name2;
        this.roomNumber = roomNumber;
        this.longOfStayFrom = longOfStayFrom;
        this.longOfStayUntil = longOfStayUntil;
    }

    public String getDescription(){
        return "Booking for "+ name1 +" in room number " + roomNumber + " from "+ longOfStayFrom + " until " +longOfStayUntil;
    }

    public String getDescription2(){
        return "Booking for "+name1+ " and " +name2+" in room number " + roomNumber + " from "+ longOfStayFrom + " until " +longOfStayUntil;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getLongOfStayFrom() {
        return longOfStayFrom;
    }

    public void setLongOfStayFrom(LocalDate LongOfStayFrom) {
        this.longOfStayFrom = LongOfStayFrom;
    }


    public LocalDate getLongOfStayUntil() {
        return longOfStayUntil;
    }

    public void setLongOfStayUntil(LocalDate longOfStayUntil) {
        this.longOfStayUntil = longOfStayUntil;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public TypeOfStay getTypeOfStay() {
        return typeOfStay;
    }

    public void setTypeOfStay(TypeOfStay typeOfStay) {
        this.typeOfStay = typeOfStay;
    }
}