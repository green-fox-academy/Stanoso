import zoo.Bird;
import zoo.Mammal;
import zoo.Reptile;

public class ZooApp {

    public static void main(String[] args) {


        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());

    }
}

// I´m sorry, but I can´t invent any specifications for each class, because mammals can fly, swim, can´t have legs and even can by born from eggs.
// Birds can also swim, run and fly and I think for each class it should be specific of what others can´t do or I can put it in animals
