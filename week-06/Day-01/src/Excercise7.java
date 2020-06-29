import java.util.Arrays;
import java.util.List;

public class Excercise7 {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        startLetter(cities,'n');

    }

    public static void startLetter (List<String> list, char c) {
        list.stream().filter(x -> x.charAt(0)==Character.toUpperCase(c)).forEach(System.out::println);
    }
}
