import java.util.Random;

public class oddEvenNumber {
    public static void main(String[] args) {
        int n;
        int i;
        Random rand = new Random();
        for (i = 0; i <= 100; i++){
            n = rand.nextInt(500);
            if (n %2 == 0 ){
                System.out.println("The number " + n + " is even");
            } else {
                System.out.println("The number " + n + " is odd");
            }
        }
    }
}
    