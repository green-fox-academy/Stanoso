package zoo;

public class Reptile extends Animal {

    private int daysFromLayingToBirth;

    public Reptile(String name) {
        this.setName(name);
    }

    public String breed () {
        return "laying eggs.";
    }

}
