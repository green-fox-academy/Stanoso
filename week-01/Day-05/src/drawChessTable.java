import java.util.Scanner;

public class drawChessTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please set the side length: ");

        int side = scanner.nextInt();


        for (int i = 0; i < side; i++) {

            for (int j = 0; j < side ; j++) {

                if ((i%2!=0 && j%2==0) || (i%2==0 && j%2!=0) )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("%");
                }

            }
            System.out.println();
        }

    }
}
