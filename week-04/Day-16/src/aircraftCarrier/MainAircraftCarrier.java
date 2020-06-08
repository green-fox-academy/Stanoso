package aircraftCarrier;

import java.sql.SQLOutput;
import java.util.Random;

public class MainAircraftCarrier {

    public static void main(String[] args) throws Exception {
        Random random = new Random();

        Carrier carrier1 = new Carrier(random.nextInt(500)+200,random.nextInt(500)+2000);
        Carrier carrier2 = new Carrier(random.nextInt(500)+200,random.nextInt(500)+2000);

        carrier1.add();


        carrier2.add();



        try {
            carrier1.fill();
            carrier2.fill();
        } catch (Exception e) {
            System.out.println("The ammo storage is empty!");
        }


        try {
            carrier1.getStatus();
            carrier2.getStatus();
        }
        catch (Exception e){
            System.out.println("It´s dead Jim :(");
        }

        carrier1.fight(carrier2);

        try {
            carrier1.getStatus();
            carrier2.getStatus();
        }
        catch (Exception e){
            System.out.println("It´s dead Jim :(");
        }
    }
}
