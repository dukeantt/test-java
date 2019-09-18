package rental;

import rental.Guest;
import rental.Rent;

public class Test {

    public static void main(String[] args) {
        Guest guestArray[] = new Guest[3];
        guestArray[0] = new Guest("Mickey", "012345678", 22);
        guestArray[1] = new Guest("Donald", "0987654321", 23);
        guestArray[2] = new Guest("Goofy", "00123123123", 24);

        Rent rentArray[] = new Rent[3];
        rentArray[0] = new Rent(2, 3, 300, guestArray[0]);
        rentArray[1] = new Rent(4, 1, 500, guestArray[1]);
        rentArray[2] = new Rent(3, 2, 400, guestArray[2]);

        String inputIdNumber = "0987654321";
        int totalPrice = 0;
        int highestAge = guestArray[0].getAge();
        int oldestGuestIndex = 0;

        for (int i = 0; i < guestArray.length; i++) {
            if (guestArray[i].getIdNumber().equals(inputIdNumber)) {
                System.out.println("--Guest Information--");
                rentArray[i].showGuestInfo();
                totalPrice = rentArray[i].calculatePrice();
                System.out.println("Total price of " + inputIdNumber + ": " + totalPrice);
                System.out.println("-------------------------------------------");
            }
            if (highestAge < guestArray[i].getAge()) {
                highestAge = guestArray[i].getAge();
                oldestGuestIndex = i;
            }

        }
        System.out.println("--The Oldest Guest--");
        rentArray[oldestGuestIndex].showGuestInfo();
    }
}
