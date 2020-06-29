import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Excercise4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        OptionalDouble average = numbers.stream().filter(n -> n % 2 == 0).mapToDouble(n -> n).average();
        System.out.println(average);

    //       int sum = numbers.stream().filter((n) -> n%2==0).reduce(0,(subtotal, element) -> subtotal + element);
    //       int numberOfEvenNumbers = numbers.stream().filter((n) -> n%2==0).reduce(0,(total, element) -> total+1);
    //       double average = (double) sum/numberOfEvenNumbers;
    //       System.out.println(average);


        System.out.println(averageNumber(numbers));
    }

    public static float averageNumber(List<Integer> inputList) {
        int sum = 0;
        int counter = 0;
        for (Integer number : inputList) {
            if (number % 2 == 0) {
                sum += number;
                counter++;
            }
        }
        return (float) sum / counter;
    }
}
