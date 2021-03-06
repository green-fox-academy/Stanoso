package zoo;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {

    public Bird(String name) {
        this.setName(name);
    }

    public String breed () {
        return "laying eggs.";
    }

    @Override
    public void land() {
        System.out.println("It is landing.");
    }

    @Override
    public void fly() {
        System.out.println("It is flying.");
    }

    @Override
    public void takeOff() {
        System.out.println("It is taking off.");
    }
}
