package sharpieSet;

public class Main {

    public static void main(String[] args) {
        SharipeSet mine = new SharipeSet();
        Sharpie black = new Sharpie("black", 1.2f);
        Sharpie red = new Sharpie("red", 1.2f);
        Sharpie blue = new Sharpie("blue", 1.2f);
        Sharpie yellow = new Sharpie("yellow", 1.2f);
        Sharpie green = new Sharpie("green", 1.2f);


        mine.addSharpie(black);
        mine.addSharpie(red);
        mine.addSharpie(blue);
        mine.addSharpie(yellow);
        mine.addSharpie(green);


        red.use();
        red.use();
        red.use();
        System.out.println("List of all sharpies: ");
        mine.overview();
        System.out.println();

        int counter = 0;
        for (Sharpie s : mine.collection) {
            if (s.inkAmount > 0) {
                counter++;
            }
        }
        System.out.println("Number of usable sharpies: " + counter);
        System.out.println();

        for (int i = 0; i < mine.collection.size() - 1; i++) {
            if (mine.collection.get(i).inkAmount <= 0)
                mine.collection.remove(i);
        }
        System.out.println("List of usable sharpies: ");
        mine.overview();

    }
}
