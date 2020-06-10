package reservation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainReservation {

    public static void main(String[] args) {

        List<Reservation> bookOfReservation = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            bookOfReservation.add(new Reservation());
        }
        for (Reservation r : bookOfReservation) {
            System.out.println(String.format("Booking# %s for %s",r.getCodeBooking(),r.getDowBooking()));
        }

    }
}
