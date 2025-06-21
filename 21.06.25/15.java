import java.time.LocalTime;

public class DigitalClock {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.print("\rTime: " + LocalTime.now().withNano(0));
            Thread.sleep(1000);
        }
    }
}
