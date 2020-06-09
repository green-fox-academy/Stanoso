package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar () {
        this.numberOfStrings = 4;
       this.sound = "Duum-duum-duum";
    }

    public BassGuitar (int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.sound = "Duum-duum-duum";
    }


}
