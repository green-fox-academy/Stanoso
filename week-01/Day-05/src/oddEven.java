import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please set a number:");
        int number = scanner.nextInt();
        if (number%2==0) {
            System.out.println("This number is even");
        }else {
            System.out.println("This number is odd");
        }
    }
}
