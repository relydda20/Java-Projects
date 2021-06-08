package Week10;

public class main {
    public static void main(String args[]) {
        Guitarist metalGuitarist = new Guitarist("Guitar", 2, "Broke as hell", 6);

        System.out.println(metalGuitarist.instrument);
        System.out.println(metalGuitarist.numberOfHands);
        System.out.println(metalGuitarist.paycheck);
        System.out.println(metalGuitarist.numberOfStrings);

        metalGuitarist.pluck();
        metalGuitarist.strum();


    }
}
