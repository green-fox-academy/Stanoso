import java.util.Scanner;

public class countFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set two numbers." +"\n" +"Number one:");
        int a = scanner.nextInt();
        System.out.println("Number two:");
        int b = scanner.nextInt();
        while (a>=b)
        {
            System.out.println("Please set another number two, which is bigger than number 1:");
            b = scanner.nextInt();
        }
        if (b-a==1)
        {
            System.out.println("There are no numbers between " + a + " and " + b);

        }
        else
        {
            for (int i = a + 1; i < b; i++) {
                System.out.println(i);
            }
        }
    }
}
