import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
    }
}
