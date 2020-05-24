import java.util.Scanner;

public class parametricAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set number of numbers:");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < number ; i++)
        {
            System.out.println("Please set number " +(i+1) + " :");
            int setnum = scanner.nextInt();
            sum = (sum+setnum);
        }
        float average = (float) sum/number;

        System.out.println("Sum : " +sum);
        System.out.println("Average : " +average);

    }
}
