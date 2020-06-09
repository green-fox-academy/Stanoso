package printable;

import java.nio.file.Paths;
import java.util.Random;

public class Domino implements Printable {

    private int leftNumber;
    private int rightNumber;
    Random random;

    public Domino() {
        this.leftNumber = new Random().nextInt(6)+1;
        this.rightNumber = new Random().nextInt(6)+1; ;
    }


    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + this.leftNumber + ", B side: " + this.rightNumber);
    }
}
