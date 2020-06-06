package parkingLot;

import java.util.Random;

public class Car {

    CarTypes type;
    CarColors color;
    Random random;

    public Car() {
        int random = new Random().nextInt(CarTypes.values().length);
        this.type = CarTypes.values()[random];
        random = new Random().nextInt(CarColors.values().length);
        this.color = CarColors.values()[random];
    }

    public CarTypes getCarType() {
        return type;
    }

    public CarColors getCarColor() {
        return color;
    }
}
