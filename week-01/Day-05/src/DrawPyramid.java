import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please set a number:");

        int rows = scanner.nextInt();
        int starsOnRow = (rows - 1) + rows ;
        int stars = rows * ((rows - 1) + rows);

        for (int i = 0; i < rows + 1; i++)
        {
            for (int j = 0; j < starsOnRow ; j++)
            {
                if (j > (starsOnRow/2) - i && j < (starsOnRow/2) + i )
                {
                    System.out.print("*");
                } else
                    {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




    }
}
