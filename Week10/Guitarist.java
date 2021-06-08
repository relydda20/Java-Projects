package Week10;

public class Guitarist extends musician implements playingGuitar{
    public int numberOfStrings;

    public Guitarist (String instrument, int numberOfHands, String paycheck, int numberOfStrings) {
        this.instrument = instrument;
        this.numberOfHands = numberOfHands;
        this.paycheck = paycheck;
        this.numberOfStrings = numberOfStrings;
    }


    public void pluck(){
        System.out.println("Plucking the guitar strings");
    }
    public void strum(){
        System.out.println("Strumming a pattern on the guitar");
    }
}
