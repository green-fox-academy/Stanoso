package charSequence;

import java.sql.SQLOutput;

public class MainChar {
    public static void main(String[] args) {
        Gnirts text = new Gnirts("testing");
        Shifter s = new Shifter("example", 2);

        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.subSequence(2,6));

        System.out.println(s.charAt(0));


    }

}
