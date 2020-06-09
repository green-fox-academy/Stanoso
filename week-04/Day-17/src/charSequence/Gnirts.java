package charSequence;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

    String text;

    public Gnirts(String text) {
        this.text = text;
    }


    @Override
    public int length() {
        return this.text.length();
    }

    @Override
    public char charAt(int index) {
        return this.text.charAt(this.text.length() - index - 1);

    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.text.subSequence(start, end);
    }


}
