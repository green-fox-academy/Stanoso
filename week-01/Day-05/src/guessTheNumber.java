import java.util.Scanner;

public class guessTheNumber {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Guess the stored number." +"\n" + "Set the number: ");
        int guess = scanner.nextInt();

        int stored = 8;

        while (guess != stored)
        {
            if (guess < stored)
            {
                System.out.println("The stored number is higher");
                System.out.println("Set another number:");
                guess = scanner.nextInt();
                            }
            else
            {
                System.out.println("The stored number is lower");
                System.out.println("Set another number:");
                guess = scanner.nextInt();
            }
        }
        System.out.println("You found the stored number: " +stored);


    }
}
