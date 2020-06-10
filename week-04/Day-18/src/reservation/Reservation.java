package reservation;

import java.util.Random;

public class Reservation implements Reservationy {

    private String[] dow = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
    private String resCode;
    private String dowCode;
    int random;

    public Reservation() {
        this.dowCode = dow[(new Random().nextInt(6) + 1)];
        this.resCode = "";
        for (int i = 0; i < 8; i++) {
            random = new Random().nextInt(500);
            if (random % 2 == 0) {
                this.resCode += String.valueOf((char) (new Random().nextInt(26) + 'a')).toUpperCase();
            } else {
                this.resCode += String.valueOf(((new Random().nextInt(8) + 1)));
            }
        }
    }

    @Override
    public String getDowBooking() {
        return this.dowCode;
    }

    @Override
    public String getCodeBooking() {
        return this.resCode;
    }
}
