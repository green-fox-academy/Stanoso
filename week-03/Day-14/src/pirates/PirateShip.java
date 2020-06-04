package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PirateShip {

    List<Pirates> crew;
    boolean captainIs;
    private String name;
    Random random = new Random();

    public PirateShip(String name) {
        this.captainIs = false;
        this.name = name;
    }

    public void fillShip() {
        this.crew = new ArrayList<>();
        int numberOfPiratesOn = random.nextInt(20) + 1;
        for (int i = 0; i < numberOfPiratesOn; i++) {
            this.crew.add(new Pirates(String.valueOf(i + 1)));
        }
        int cap = random.nextInt(numberOfPiratesOn);
        this.crew.get(cap).becomeCaptain(this);
    }

    public boolean isCaptain() {
        return this.captainIs;
    }

    public void shipRepresentation() {
        System.out.println("The pirate ship: " +this.name);
        int captainPos;
        int alive = 0;
        int pass = 0;
        int dead = 0;
        for (int i = 0; i < this.crew.size(); i++) {
            if (this.crew.get(i).isCaptain()) {
                captainPos = i;
                if (this.crew.get(captainPos).getDrunk()==1 ) {
                    System.out.println("The captain (nr.) " + this.crew.get(captainPos).name + " has consumed " + this.crew.get(captainPos).getDrunk() + " rum and " + this.crew.get(captainPos).getAlive());
                } else {
                    System.out.println("The captain (nr.) " + this.crew.get(captainPos).name + " has consumed " + this.crew.get(captainPos).getDrunk() + " rums and " + this.crew.get(captainPos).getAlive());
                }
            }
            if (this.crew.get(i).pirateStatus() == 1) {
                alive++;
            } else  if (this.crew.get(i).pirateStatus() == 0) {
                dead++;
            } else {
                pass++;
            }
        }
        System.out.println("Number of pirates on board: " + this.crew.size());
        System.out.println("Pirates status: " +alive+ " alive, " + pass + " passed out, " + dead+ " dead \n");
    }

    public void battle (PirateShip opponent ) {

        int tScore = 0;
        int oScore = 0;

        for (int i = 0; i < this.crew.size() ; i++) {
            if (this.crew.get(i).pirateStatus()==1) {
                tScore++;
            }
            if (this.crew.get(i).isCaptain()) {
                tScore -= this.crew.get(i).getDrunk();
            }

        }
        for (int i = 0; i < opponent.crew.size() ; i++) {
            if (opponent.crew.get(i).pirateStatus()==1) {
                oScore++;
            }
            if (opponent.crew.get(i).isCaptain()) {
                oScore -= opponent.crew.get(i).getDrunk();
            }

        }
        System.out.println(this.name+ " score : " + tScore);
        System.out.println(opponent.name+ " score : " + oScore);

        if (tScore == oScore) {
            System.out.println("It is a tie.");
        } else if (tScore > oScore) {
            System.out.println(this.name + " wins.");
        } else {
            System.out.println(opponent.name+ " wins.");
        }

    }
}
