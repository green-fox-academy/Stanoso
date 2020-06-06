package parkingLot;

import java.util.*;

public class MainCar {

    public static void main(String[] args) {
        ArrayList<Car> listOfCars = new ArrayList<>();
        HashMap<CarTypes, Integer> mapOfCars = new HashMap<CarTypes, Integer>();
        HashMap<CarColors, Integer> mapOfColors = new HashMap<CarColors, Integer>();
        HashMap<String, Integer> mapMostFrequent = new HashMap<String, Integer>();

        for (int i = 0; i < 256; i++) {
            listOfCars.add(i, new Car());
        }


        for (int i = 0; i < listOfCars.size(); i++) {
            if (mapOfCars.containsKey(listOfCars.get(i).getCarType())) {
                int counterTypes = mapOfCars.get(listOfCars.get(i).getCarType());
                mapOfCars.put(listOfCars.get(i).getCarType(), counterTypes + 1);
            } else {
                mapOfCars.put(listOfCars.get(i).getCarType(), 1);
            }
            if (mapOfColors.containsKey(listOfCars.get(i).getCarColor())) {
                int counterColors = mapOfColors.get(listOfCars.get(i).getCarColor());
                mapOfColors.put(listOfCars.get(i).getCarColor(), counterColors + 1);
            } else {
                mapOfColors.put(listOfCars.get(i).getCarColor(), 1);
            }
            String typeColor = listOfCars.get(i).getCarType().name() + " " + listOfCars.get(i).getCarColor().name();
            if (mapMostFrequent.containsKey(typeColor)) {
                int counterFreqency = mapMostFrequent.get(typeColor);
                mapMostFrequent.put(typeColor, counterFreqency + 1);
            } else {
                mapMostFrequent.put(typeColor, 1);
            }

        }
        List<Integer> numberOfFreqent = new ArrayList<Integer>();
        for (Integer c : mapMostFrequent.values()) {
            numberOfFreqent.add(c);
        }

        Collections.sort(numberOfFreqent);

        System.out.println(mapOfCars);
        System.out.println(mapOfColors);
        System.out.println(mapMostFrequent);
        System.out.println();
        System.out.println("The most frequent car: " +getKeyFromValue(mapMostFrequent, numberOfFreqent.get(numberOfFreqent.size() - 1)) + " " + numberOfFreqent.get(numberOfFreqent.size() - 1));


    }

    public static String getKeyFromValue(HashMap map, Object number) {
        String names = "";
        for (Object cT : map.keySet()) {
            if (map.get(cT).equals(number)) {
                names = names + cT.toString() + ", ";
            }
        }
        names = (String) names.subSequence(0,names.length()-2) + ": ";
        return names;
    }
}
