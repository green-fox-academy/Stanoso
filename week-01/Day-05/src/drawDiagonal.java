import javax.swing.*;
import java.util.Scanner;

public class drawDiagonal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set a number: ");

        int size = scanner.nextInt();


        for (int i = 0; i < size ; i++) {

            for (int j = 0; j < size ; j++) {

                if (i==0 || i==size-1 || j==0 || j==size-1 || i==j)
                {
                    System.out.print("%");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();


        }

    }
}
