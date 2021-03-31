public class primeNumber {
    public static void main(String[] args) {
        System.out.println("List of prime numbers from 1 to 500 inclusive: ");
        for (int a = 1; a<=500; a++){
            if (prime(a))
                System.out.print(a + " ");
        }
    }

    static boolean prime(int n){
        {
            if (n <= 1)
                return false;

            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;
      
            return true;
        }
    }
}