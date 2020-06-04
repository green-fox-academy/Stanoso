package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> farmAnimals;
    private int places;
    private int remains;

    public Farm(int places) {
        this.farmAnimals = new ArrayList<>();
        this.places = places;
        this.remains = places;
    }

    public void breed(Animal name) {
        if (remains > 0) {
            this.farmAnimals.add(name);
            remains--;
        } else {
            System.out.println("No other places for new animals.");
        }
    }

    public void slaughter() {
        int slaugh = -1;
        for (int i = 0; i < this.farmAnimals.size() - 1; i++) {
            if (farmAnimals.get(i).hunger > farmAnimals.get(i+1).hunger) {
                slaugh = i+1;
            } else if ((farmAnimals.get(i).hunger < farmAnimals.get(i+1).hunger)) {
                slaugh = i;
            }
        }
        if (slaugh == -1) {
            System.out.println("No slaughter, all animals have the same hunger");
        } else {
            farmAnimals.remove(slaugh);
            remains++;
        }
    }

    public void farmSituation () {
        for (int i = 0; i < farmAnimals.size() ; i++) {
            System.out.print("Animal: " +(i+1)+ " hunger: " + farmAnimals.get(i).hunger + " thirst: " + farmAnimals.get(i).thirst + "\n");
        }
    }

}
