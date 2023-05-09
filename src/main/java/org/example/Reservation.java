package org.example;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;
    private double price;


    //Constructor

    public Reservation(int numberOfNights, boolean weekend, double reservationTotal, String roomType) {
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.roomType = roomType;
        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }
    }

    // Getters and Setters

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        if (weekend == true) {
            return price * 1.1 * numberOfNights;
        } else {
            return price * numberOfNights;
        }
    }
    public String getRoomType() {
        return roomType;
    }
}