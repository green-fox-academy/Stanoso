package sum;

import java.util.ArrayList;
import java.util.List;

public class MainSum {

    public static void main(String[] args) {

        List<Integer> t = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            t.add(1);
        }
        Sum testL = new Sum(t);

        System.out.println(testL.sum());



    }
}
