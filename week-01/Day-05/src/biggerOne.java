import java.util.Scanner;

public class biggerOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set number A:");
        int a = scanner.nextInt();
        System.out.println("Please set number B:");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Number A is bigger than number B");
        }else {
        System.out.println("Number B is bigger than number A");
        }
    }
}
