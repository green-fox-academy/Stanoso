import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainFox {

    public static void main(String[] args) {

        List<Fox> foxList = new ArrayList<>();

        foxList.add(new Fox("1", "red", 2));
        foxList.add(new Fox("2", "reddish", 3));
        foxList.add(new Fox("3", "ginger", 8));
        foxList.add(new Fox("4", "red", 9));
        foxList.add(new Fox("5", "ginger", 2));
        foxList.add(new Fox("6", "pink", 11));
        foxList.add(new Fox("7", "green", 2));
        foxList.add(new Fox("8", "green", 13));

        printFoxes(greenFox(foxList));
        System.out.println("");
        printFoxes(youngGreenFox(foxList));
        System.out.println("");
        foxColorFrequency(foxList);

    }

    public static List<Fox> greenFox(List<Fox> foxes) {
        return foxes.stream().filter((f -> f.getColor().equals("green"))).collect(Collectors.toList());
    }

    public static List<Fox> youngGreenFox(List<Fox> foxes) {
        return foxes.stream().filter(f -> f.getColor().equals("green") && f.getAge() < 5).collect(Collectors.toList());
    }

    public static void foxColorFrequency(List<Fox> foxes) {
        foxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor, Collectors.summingInt(x -> 1))).entrySet().forEach(System.out::println);
    }

    public static void printFoxes(List<Fox> foxes) {
        for (Fox fox : foxes) {
            System.out.println("Name " + fox.getName() + ", Color " + fox.getColor() + ", Age " + fox.getAge());
        }
    }
}