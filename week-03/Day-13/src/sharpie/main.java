package sharpie;

public class main {
    public static void main(String[] args) {

        Sharpie s1 = new Sharpie("red", 1.5f);
        System.out.println(s1.inkAmount);
        s1.use();
        s1.use();
        s1.use();
        s1.use();


    }


}
