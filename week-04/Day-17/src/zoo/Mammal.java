package zoo;

public class Mammal extends Animal {

    private float bloodTemperature;

    public Mammal(String name) {
        this.setName(name);
    }

    public String breed () {
        return "pushing miniature versions out.";
    }

    public void feedingWithMilk (){
        System.out.println("Milk is served ... ");
    }

}
