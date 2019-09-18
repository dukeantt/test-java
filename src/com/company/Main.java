package com.company;

import com.company.Guest;
import com.company.Rent;

public class Main {
    public static void main(String[] args) {
        int totalPrice;
        System.out.println("Hello World");
        Guest guest1 = new Guest(22, "Duc Anh", "013592313");
        Guest guest2 = new Guest(30, "Mickey", "0132312123");
        Guest guest3 = new Guest(32, "Donald", "0345762313");
        Rent rent1 = new Rent(2, 3, 200, guest1);
        rent1.showGuestInformation();
        totalPrice = rent1.calculatePrice();
        System.out.println("Total price:" + totalPrice);
    }
}
