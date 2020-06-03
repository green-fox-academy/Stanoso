package sharpieSet;

import java.util.Random;

public class Sharpie {

    String color;
    Float width;
    Float inkAmount;
    Random ink = new Random();


    public Sharpie(String color, Float width) {
        this.color = color;
        this.width = width;
        this.inkAmount =  (float) (ink.nextInt(50));
    }

    public void use() {
        Random random = new Random();
        this.inkAmount -= (random.nextFloat()*10);
        if (this.inkAmount<0) {
            this.inkAmount=0f;
        }
        // System.out.println("Ink decreased to: " + inkAmount);

    }
}
