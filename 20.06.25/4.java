public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = num > 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(num + (isPrime ? " is Prime" : " is Not Prime"));
    }
}
