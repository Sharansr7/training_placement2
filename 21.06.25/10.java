public class EmailValidator {
    public static void main(String[] args) {
        String email = "user@example.com";
        boolean isValid = email.contains("@") && email.endsWith(".com");
        System.out.println("Email valid: " + isValid);
    }
}
