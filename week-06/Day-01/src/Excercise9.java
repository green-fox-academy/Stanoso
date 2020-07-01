import java.util.function.Function;
import java.util.stream.Collectors;

public class Excercise9 {

    public static void main(String[] args) {

        String text = "Mezi domama ma ma mama malou zahradku";

        text.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(x ->1)))
                .entrySet()
                .forEach(System.out::println);

    }
}
