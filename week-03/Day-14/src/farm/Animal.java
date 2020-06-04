package farm;



public class Animal {

    int hunger;
    int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        this.hunger--;
        System.out.println("Hunger " + hunger);
    }

    public void drink() {
        this.thirst--;
        System.out.println("Thirst " + thirst);
    }

    public void play() {
        this.hunger++;
        this.thirst++;
        System.out.println("Hunger " + hunger);
        System.out.println("Thirst " + thirst);
    }


}
