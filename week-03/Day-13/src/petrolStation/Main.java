package petrolStation;

public class Main {
    public static void main(String[] args) {

        Station shell = new Station();
        Car vw = new Car(14,60);
        Car ford = new Car (5,75);
        Car bmw = new Car(60,63);

        shell.refill(vw);
        shell.refill(ford);
        shell.refill(bmw);



    }

}
