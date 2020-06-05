package sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sum() {
        List<Integer> t = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            t.add(1);
        }
        Sum testL = new Sum(t);
        int expected = 5;
        assertEquals(expected, testL.sum() );
    }

    @Test
    void sum1() {
        List<Integer> t = new ArrayList<>();
        Sum testL = new Sum(t);
        assertNull(testL);
    }
    @Test
    void sum2() {
        List<Integer> t = new ArrayList<>();
        t.add(1);
        Sum testL = new Sum(t);
        int expected = 1;
        assertEquals(expected, testL.sum() );
    }


}