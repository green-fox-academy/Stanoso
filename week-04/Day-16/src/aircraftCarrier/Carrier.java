package aircraftCarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carrier {

    protected List<Aircrafts> listOfAircrafts;
    private int ammoStorage;
    private int healtPoints;
    private boolean random;
    private int randomI;

    public Carrier(int ammoStorage, int healtPoints) {
        this.listOfAircrafts = new ArrayList<>();
        this.ammoStorage = ammoStorage;
        this.healtPoints = healtPoints;
    }

    public void add() {
        for (int i = 0; i < new Random().nextInt(10) + 1; i++) {
            this.random = new Random().nextBoolean();
            if (random) {
                listOfAircrafts.add(new F16());
            } else {
                listOfAircrafts.add(new F35());
            }
        }
    }

    public void fill() throws Exception {
        for (Aircrafts a : this.listOfAircrafts) {
            if (a.isPriority() && this.ammoStorage > 0) {
                this.ammoStorage = a.refill(this.ammoStorage);
            }
        }
        for (Aircrafts a : this.listOfAircrafts) {
            if (a.isPriority() == false && this.ammoStorage > 0) {
                this.ammoStorage = a.refill(this.ammoStorage);
            }
        }
        if (this.ammoStorage <= 0) {
            throw new Exception("The ammo storage is empty!");
        }
    }

    public void fight(Carrier enemyCarrier) {
        for (Aircrafts a : this.listOfAircrafts) {
            enemyCarrier.healtPoints -= a.fight();
        }
        for (Aircrafts e : enemyCarrier.listOfAircrafts) {
            this.healtPoints -= e.fight();
        }
    }

    public int totalDamage() {
        int total = 0;
        for (Aircrafts a : this.listOfAircrafts) {
            total += a.ammo * a.damage;
        }
        return total;
    }

    public void getStatus() throws Exception {
        if (this.healtPoints < 0) {
            throw new Exception("It´s dead Jim :(");
        } else {

            System.out.println("HP: " + this.healtPoints + ", Aircraft count: " + this.listOfAircrafts.size() + ", Ammo Storage : " + this.ammoStorage + ", Total damage :" + this.totalDamage());
            System.out.println("Aircrafts:");
            for (Aircrafts a : this.listOfAircrafts) {
                System.out.println("Type " + a.getType() + ", Ammo: " + a.ammo + ", Base Damage: " + a.damage + ", All Damage: " + a.ammo * a.damage);
            }
        }
        System.out.println();
    }


}
