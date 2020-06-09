package main.java.music;

public abstract class StringedInstrument extends Instrument {

    protected int numberOfStrings;
    protected String sound;

    public void play () {
        System.out.println(this.getClass().getSimpleName()+ ", a "+this.sound());
    }

    public String sound()
    {
        return this.numberOfStrings+"-stringed intrument that goes "+this.sound;
    }



}
