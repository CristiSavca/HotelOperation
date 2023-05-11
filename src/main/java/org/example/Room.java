package org.example;

enum RoomStatus {OCCUPIED_AND_DIRTY, UNOCCUPIED_AND_DIRTY, OCCUPIED_AND_CLEAN, AVAILABLE}

public class Room {
    private int numberOfBeds;
    private double price;
    private RoomStatus roomStatus;

    // Getters and Setters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor
    public Room(int numberOfBeds, double price, RoomStatus roomStatus) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.roomStatus = RoomStatus.AVAILABLE;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus status){
        this.roomStatus = status;
    }

    public void checkIn() {
        setRoomStatus(RoomStatus.OCCUPIED_AND_DIRTY);
    }

    public void checkOut() {
        setRoomStatus(RoomStatus.UNOCCUPIED_AND_DIRTY);
    }

    public void cleanRoom() {
        if (roomStatus == RoomStatus.UNOCCUPIED_AND_DIRTY){
            roomStatus = RoomStatus.AVAILABLE;
        } else if (roomStatus == RoomStatus.OCCUPIED_AND_DIRTY){
            roomStatus = RoomStatus.OCCUPIED_AND_CLEAN;
        }
    }
}