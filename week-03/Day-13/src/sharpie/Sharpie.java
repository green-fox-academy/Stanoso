package sharpie;

import java.util.Random;

public class Sharpie {

    String color;
    Float width;
    Float inkAmount;


    public Sharpie(String color, Float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100f;
    }

    public void use() {
        Random random = new Random();
        this.inkAmount -= random.nextFloat();
        System.out.println("Ink decreased to: " + inkAmount);
    }
}
