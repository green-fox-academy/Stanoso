package apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @Test
    void getApple() {
        Apples f = new Apples("apple");
        String expected = "apple";
        assertEquals(expected,f.getApple());

    }
}