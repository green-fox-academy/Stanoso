package flyable;

public class Helicopter extends Vehicle implements Flyable{


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
