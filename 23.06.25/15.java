import java.time.LocalDate;

class Leave {
    String emp;
    LocalDate from, to;

    Leave(String emp, LocalDate from, LocalDate to) {
        this.emp = emp; this.from = from; this.to = to;
    }

    long days() {
        return java.time.temporal.ChronoUnit.DAYS.between(from, to) + 1;
    }
}

public class LeaveApp {
    public static void main(String[] args) {
        Leave l = new Leave("Sharan", LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 5));
        System.out.println(l.emp + " applied for " + l.days() + " days leave.");
    }
}
