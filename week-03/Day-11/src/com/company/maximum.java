/* NOT FINISHED

package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class maximum {

    public static void main(String[] args) {
        Integer[] field = {1, 5, 3};
        System.out.println(findMax(field));
    }

    public static Integer findMax(Integer[] n) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(n));
        if (n.length > 1) {
            if (n[n.length - 1] > n[n.length - 2]) {
                list.remove(n.length - 2);
                n = list.toArray(new Integer[0]);
                return n[n.length-1];
                findMax(n);
            } else {
                list.remove(n.length - 1);
                n = list.toArray(new Integer[0]);
                return[n.length-2];
                findMax(n);
            }
        } else {
            return n[];
        }
        return n[0];
    }
}
*/