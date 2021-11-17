package com.engeto;

    public enum TypeOfStay {
        OCCUPATIONAL_STAY("occupational stay"),
        HOLIDAY_STAY("holiday stay");

        String description;


        TypeOfStay(String description) {
            this.description = description;

        }

        @Override
        public String toString () {
        return description;
    }

    }

