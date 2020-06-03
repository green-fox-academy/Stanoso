package counter;

public class Counter {

    int value;
    private int iniValue;

    public Counter(int value) {
        this.value = value;
        iniValue = value;
    }

    public Counter() {
        this.value = 0;
        iniValue = 0;
    }

    public void add()
    {
        this.value++;
    }

    public int get() {
        return this.value;
    }

    public void add(int number)
    {
        this.value+= number;
    }

    public void reset() {
        this.value = iniValue;
    }
}
