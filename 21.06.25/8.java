public class InterestCalculator {
    public static void main(String[] args) {
        double principal = 50000;
        double rate = 6.5;
        int time = 3;

        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: ₹" + interest);
    }
}
