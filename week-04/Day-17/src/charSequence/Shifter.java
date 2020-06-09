package charSequence;

public class Shifter implements CharSequence {

    String string;
    int pos;

    public Shifter (String string, int pos) {
        this.pos = pos;
        this.string = string;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(this.pos);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
