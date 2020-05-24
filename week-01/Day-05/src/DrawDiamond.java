import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set a number:");
        int rows = scanner.nextInt();
        int starsOnRow = rows - 1 + rows;


        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < starsOnRow; ++j) {
                if (j > starsOnRow / 2 - i && j < starsOnRow / 2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for (int i = rows - 1; i > 0; i--) {
            for (int j = 0; j < starsOnRow; ++j) {
                if (j > starsOnRow / 2 - i && j < starsOnRow / 2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}

