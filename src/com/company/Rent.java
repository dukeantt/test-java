package com.company;

import com.company.Guest;

class Rent {
    private int noDay;
    private int roomType;
    private int price;
    private Guest guest;

    public Rent() {
    }

    public Rent(int noDay, int roomType, int price, Guest guest) {
        this.noDay = noDay;
        this.roomType = roomType;
        this.price = price;
        this.guest = guest;
    }


    public void showGuestInformation() {
        System.out.println("Guest Information: ");
        System.out.println("\t + Name:" + this.guest.getName());
        System.out.println("\t + Age:" + this.guest.getAge());
        System.out.println("\t + ID number:" + this.guest.getIdNumber());
        System.out.println("------------------------------------------");
    }

    public int calculatePrice() {
        return this.noDay * this.roomType * this.price;
    }

    public int getNoDay() {
        return noDay;
    }

    public void setNoDay(int noDay) {
        this.noDay = noDay;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

}
