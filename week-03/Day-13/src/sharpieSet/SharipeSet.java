package sharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharipeSet {
    List<Sharpie> collection;

    public SharipeSet() {
        this.collection = new ArrayList<>();
    }

    public void addSharpie(Sharpie sharpie) {
        this.collection.add(sharpie);
    }
    public void overview ()
    {
        for (Sharpie col: collection) {

            System.out.print("Color: "+col.color + ", width: " + col.width + " , ink amount: " +col.inkAmount + "\n");
        }
    }
}
