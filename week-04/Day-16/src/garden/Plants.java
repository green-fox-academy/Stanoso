package garden;

import java.util.List;

public class Plants {

    protected float water;
    protected float adWater;
    protected float waterLimit;
    protected String name;

    public Plants(String name, float adWater, float waterLimit) {
        this.name = name;
        this.water = 0f;
        this.adWater = adWater;
        this.waterLimit = waterLimit;
    }


}



