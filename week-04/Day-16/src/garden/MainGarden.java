package garden;

import java.util.ArrayList;
import java.util.List;

public class MainGarden {

    public static void main(String[] args) {

        ArrayList<Plants> garden1 = new ArrayList<Plants>();

        Trees purple = new Trees("purple");
        garden1.add(purple);
        Trees orange = new Trees("orange");
        garden1.add(orange);
        Flowers yellow = new Flowers("yellow");
        garden1.add(yellow);
        Flowers blue = new Flowers("blue");
        garden1.add(blue);

        reviewGarden(garden1);
        System.out.println();
        watering(garden1, 40);
        System.out.println();
        reviewGarden(garden1);
        System.out.println();
        watering(garden1, 70);
        System.out.println();
        reviewGarden(garden1);


    }

    public static void watering(ArrayList<Plants> g, int w) {
        System.out.println("Watering with " + w);
        int wateringCounter = 0;
        for (Plants p : g) {
            if (p.water < p.waterLimit) {
                wateringCounter++;
            }
        }
        for (Plants pw : g) {
            if (pw.water < pw.waterLimit) {
                pw.water += (w / wateringCounter) * pw.adWater;
            }
        }
        for (Plants ap : g) {
            if (ap.water >= ap.waterLimit) {
                System.out.println("The " + ap.name + " " + ap.getClass().getName().substring(ap.getClass().getName().indexOf(".") + 1, ap.getClass().getName().length()-1) + " doesn´t need water.");
            } else {
                System.out.println("The " + ap.name + " " + ap.getClass().getName().substring(ap.getClass().getName().indexOf(".") + 1, ap.getClass().getName().length()-1) + " needs water.");
            }

        }
    }

    public static void reviewGarden(ArrayList<Plants> gar) {
        System.out.println("Number of plants in the garden: " + gar.size());
        for (Plants ap : gar) {
            System.out.println("The "+ ap.name+ " " +ap.getClass().getName().substring(ap.getClass().getName().indexOf(".") + 1, ap.getClass().getName().length()-1)  + " is watered at " + ap.water);

        }
    }


}
