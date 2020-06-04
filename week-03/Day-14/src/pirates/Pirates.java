package pirates;

import java.util.Random;

public class Pirates {

    private int drunk;
    private int alive; // 0 - dead, 1 - alive, 2 - passed out
    public String name;
    private boolean captain;
    Random random = new Random();

    public Pirates(String name) {
        this.name = name;
        this.alive = random.nextInt(2)+1;
        this.drunk = random.nextInt(5);
        this.captain = false;
    }

    public void drinkSomeRum() {
        if (this.alive == 0) {
            System.out.println(this.name + " is dead.");
        } else if (this.alive == 2) {
            System.out.println(this.name + " is passed out.");
        }
        this.drunk++;
    }

    public void howsItGoingMate() {
        if (this.alive == 0) {
            System.out.println(this.name + " is dead.");
        } else if (this.alive == 2) {
            System.out.println(this.name + " is passed out.");
        } else if (this.drunk < 5) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.alive = 2;
        }

    }

    public void die() {
        this.alive = 0;
    }

    public void brawl(Pirates with) {
        if (with.alive == 0) {
            System.out.println(with.name + " is dead.");
        } else if (with.alive == 2) {
            System.out.println(this.name + " is passed out.");
        } else {
            Random random = new Random();
            int decide = random.nextInt(9);
            if (decide < 4) {
                this.alive = 0;
                System.out.println(this.name + " is dead.");
            } else if (decide > 3 && decide < 7) {
                with.alive = 0;
                System.out.println(with.name + " is dead.");
            } else {
                System.out.println("Both pass out.");
                this.alive = 2;
                with.alive = 2;
            }

        }
    }

    public void wakeUp() {
        this.alive = 1;
        System.out.println(this.name + " is awake and sober");
    }

    public void becomeCaptain(PirateShip pShip) {
        if (pShip.captainIs = false) {
            System.out.printf("This ship has a captain.");
        } else {
            this.captain = true;
            pShip.captainIs = true;
        }
    }

    public boolean isCaptain () {
        return captain;
    }

    public int getDrunk() {
        return drunk;
    }

    public String getAlive() {
        if (this.alive == 0)
        {
            return "is dead";
        } else if (this.alive == 1) {
            return "is alive (yet)";
        } else {
            return "is passed out";
        }

    }

    public int pirateStatus () {
        if (this.alive == 0) {
            return 0;
        }
        else if (this.alive == 1) {
            return 1;
        } else
        {
            return 2;
        }
    }
}
