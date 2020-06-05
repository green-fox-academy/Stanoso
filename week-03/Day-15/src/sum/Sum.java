package sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    List<Integer> list;

    public Sum (List list) {
        this.list = list;
    }

    public Integer sum () {
        if (this.list.size() >= 0) {
            int sumOf = 0;
            for (int p : this.list) {
                sumOf += p;
            }
            return sumOf;
        }
        else {
            return null;
        }
    }
}
