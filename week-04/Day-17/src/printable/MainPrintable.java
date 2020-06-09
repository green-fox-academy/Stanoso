package printable;

import java.util.ArrayList;
import java.util.List;

public class MainPrintable {

    public static void main(String[] args) {

        List<Domino> domList = new ArrayList<Domino>();
        List<Todo> toDoList = new ArrayList<Todo>();

        toDoList.add(new Todo("task", "high", false));
        toDoList.add(new Todo("task", "high", false));
        toDoList.add(new Todo("task", "high", true));
        toDoList.add(new Todo("task", "low", false));
        toDoList.add(new Todo("task", "high", false));

          domList.add(new Domino());
          domList.add(new Domino());
          domList.add(new Domino());
          domList.add(new Domino());
          domList.add(new Domino());
          domList.add(new Domino());
          domList.add(new Domino());
          domList.add(new Domino());
          domList.add(new Domino());

        for (Domino d : domList) {
            d.printAllFields();
        }

        for (Todo t : toDoList) {
            t.printAllFields();
        }

    }
}
