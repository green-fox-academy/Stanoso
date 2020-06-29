import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Excercise6 {
    public static void main(String[] args) {

        String text = "HelLo";
        text.chars().filter(c -> Character.isUpperCase(c)).mapToObj(x -> (char) x).forEach(System.out::println);

        List<String > textToChar = Arrays.asList(text.split(""));
        textToChar.stream().filter(c -> Character.isUpperCase(c.charAt(0))).forEach(System.out::println);

        System.out.println(upperChar(text));
    }

    public static String upperChar(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                result += String.valueOf(text.charAt(i));
            }
        }
        return result;
    }
}
