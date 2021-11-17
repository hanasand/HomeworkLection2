package com.engeto;

public class Rooms {
    private int roomNumber;
    private String typeOfBed;
    private boolean balcony;
    private boolean viewOfTheSea;
    private int price;



    public Rooms(int roomNumber,String typeOfBed, boolean balcony,boolean viewOfTheSea, int price ){
        this.roomNumber = roomNumber;
        this.typeOfBed = typeOfBed;
        this.balcony = balcony;
        this.viewOfTheSea = viewOfTheSea;
        this.price = price;
    }


    public String getDescription(){
        return roomNumber + " number " + typeOfBed +" room "+" with "+ giveBalcony() +" and "+giveViewOfTheSea() +" with price "+ price +" Kč/night";
    }

    public String giveBalcony(){
        if (isBalcony())
            return "balcony";
        return "no balcony";
    }

    public String giveViewOfTheSea (){
        if (isViewOfTheSea())
            return "view of the sea";
            return "no view of the sea";
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTypeOfBed() {
        return typeOfBed;
    }

    public void setTypeOfBed(String typeOfBed) {
        this.typeOfBed = typeOfBed;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isViewOfTheSea() {
        return viewOfTheSea;
    }

    public void setViewOfTheSea(boolean viewOfTheSea) {
        this.viewOfTheSea = viewOfTheSea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
