import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        Random r = new Random();
        int otp = 100000 + r.nextInt(900000);
        System.out.println("Your OTP is: " + otp);
    }
}
