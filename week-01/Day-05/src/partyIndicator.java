import java.util.Scanner;

public class partyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set number of girls at the party:");
        int girls = scanner.nextInt();
        System.out.println("Please set number of boys at the party:");
        int boys = scanner.nextInt();

        if (girls <= 0) {
            System.out.println("Sausage party");
        }else if (boys == girls && (boys+girls) >= 20) {
            System.out.println("The party is excellent!");
        }else if ((boys + girls) >= 20) {
            System.out.println("Quite cool party!");
        }else {
            System.out.println("Average party ...");
        }
    }
}
