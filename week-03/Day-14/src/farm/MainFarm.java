package farm;

public class MainFarm {

    public static void main(String[] args) {

        Farm hm = new Farm(5);
        Animal goat1 = new Animal();
        Animal goat2 = new Animal();
        Animal goat3 = new Animal();
        Animal goat4 = new Animal();
        Animal goat5 = new Animal();
        Animal goat6 = new Animal();

        hm.breed(goat1);
        hm.breed(goat2);
        hm.breed(goat3);
        hm.breed(goat4);
        hm.breed(goat5);
        hm.breed(goat6);

        hm.farmSituation();

        hm.slaughter();

        goat3.eat();
        hm.slaughter();
        hm.farmSituation();
        hm.breed(goat6);

    }
}
