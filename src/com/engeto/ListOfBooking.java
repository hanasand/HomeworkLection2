package com.engeto;

import java.time.LocalDate;

    public class ListOfBooking {
    LocalDate dateOfStay;
    int numberOfBooking;

        public ListOfBooking (int numberOfBooking, LocalDate dateOfStay){
        this.numberOfBooking = numberOfBooking;
        this.dateOfStay = dateOfStay;
        }

        public LocalDate getDateOfStay() {
            return dateOfStay;
        }

        public void setDateOfStay(LocalDate dateOfStay) {
            this.dateOfStay = dateOfStay;
        }

        public int getNumberOfBooking() {
            return numberOfBooking;
        }

        public void setNumberOfBooking(int numberOfBooking) {
            this.numberOfBooking = numberOfBooking;
        }
    }


