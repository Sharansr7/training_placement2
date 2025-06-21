public class PasswordChecker {
    public static void main(String[] args) {
        String password = "Sharan@123";
        if (password.length() >= 8 && password.matches(".*[A-Z].*")
            && password.matches(".*[0-9].*") && password.matches(".*[@#$%].*")) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
