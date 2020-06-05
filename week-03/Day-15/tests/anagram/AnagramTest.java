package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void solveAnagram() {
    String text = "abbbbbbb";
    Anagram a1 = new Anagram("bbbbbnba");
    assertEquals(true,a1.solveAnagram(text));
    }
}