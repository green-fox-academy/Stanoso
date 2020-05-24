import java.util.Scanner;

public class drawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set a number: ");

        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
