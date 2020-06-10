package unfinished.older;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class ProductDatabase2 {

    public static void main(String[] args) {

        HashMap <String, Integer> database = new HashMap<>();

        database.put("Eggs",200);
        database.put("Milk",200);
        database.put("Fish",400);
        database.put("Apples",150);
        database.put("Bread",50);
        database.put("Chicken",550);


        System.out.println("These products cost less than 201:  ");
        database.forEach((k,v) ->
        {
            if (v < 201) {
                System.out.println(k);
            }
        });
        System.out.println();

        System.out.println("These products cost more than 150:  ");
        database.forEach((k,v) ->
        {
            if (v > 150) {
                System.out.println(k+ ": "+v);
            }
        });



    }
}
