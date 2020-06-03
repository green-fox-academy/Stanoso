package petrolStation;

import java.sql.SQLOutput;

public class Station {

    int gasAmount;

    public void refill(Car type) {
        this.gasAmount -= (type.capacity - type.gasAmount);
        System.out.println("Amount of gas reffiled total:" +gasAmount);
        type.gasAmount += (type.capacity - type.gasAmount);
        System.out.println("Car reffiled to: " +type.gasAmount);
        System.out.println("Car tank capacity:" +type.capacity);
        System.out.println();
    }
}
