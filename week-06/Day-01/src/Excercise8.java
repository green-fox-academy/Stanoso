import jdk.nashorn.api.tree.ArrayLiteralTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise8 {

    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a','h','o','j');
        String join = list.stream().map(c -> String.valueOf(c)).collect(Collectors.joining());
        System.out.println(join);
    }
}
