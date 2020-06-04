package pirates;

import java.util.ArrayList;
import java.util.List;

public class MainPirates {

    public static void main(String[] args) {

        PirateShip one = new PirateShip("Magic wave");
        PirateShip two = new PirateShip("Old Lady");
        PirateShip three = new PirateShip("Broken tooth");

        one.fillShip();
        two.fillShip();
        three.fillShip();

        one.shipRepresentation();
        two.shipRepresentation();
        three.shipRepresentation();

        one.battle(two);
        one.battle(three);



    }


}
