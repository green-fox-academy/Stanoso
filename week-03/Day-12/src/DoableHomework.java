import javax.swing.*;
import java.sql.SQLOutput;
import java.util.HashMap;

public class DoableHomework {

    public static void main(String[] args) {

        HashMap<String, String[]> trees = new HashMap<String, String[]>();
        String[] desc1 = {"leaf tree", "green", "35", "F"};
        String[] desc2 = {"leaf tree", "green", "100", "F/M"};
        String[] desc3 = {"conifer", "green", "15", "M"};
        String[] desc4 = {"leaf tree", "dark green", "42", "F"};
        String[] desc5 = {"conifer", "green", "68", "F"};
        trees.put("oak", desc1);
        trees.put("beech", desc2);
        trees.put("pine", desc3);
        trees.put("appletree", desc4);
        trees.put("spruce", desc5);

        System.out.println("oak: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(trees.get("oak")[i] + " ");
        }
        System.out.println("\nbeech: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(trees.get("beech")[i] + " ");
        }
        System.out.println("\npine: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(trees.get("pine")[i] + " ");
        }
        System.out.println("\nappletree: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(trees.get("appletree")[i] + " ");
        }
        System.out.println("\nspruce: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(trees.get("spruce")[i] + " ");
        }

    }
}
