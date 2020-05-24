import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please set a number:");
        int n = scanner.nextInt();

        for (int i = 1; i < 11 ; i++)
        {
            System.out.println(i +" * " + n + " = " +(i*n) );
        }

    }
}
