package zoo;

public class Bird extends Animal {

    public Bird(String name) {
        this.setName(name);
    }

    public String breed () {
        return "laying eggs.";
    }
}
