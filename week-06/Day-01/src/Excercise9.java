import java.util.function.Function;
import java.util.stream.Collectors;

public class Excercise9 {

    public static void main(String[] args) {

        String text = "Mezi domama ma ma mama malou zahradku";
        text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c->1)))
                .entrySet()
                .stream()
                .forEach(System.out::println);

    }
}
