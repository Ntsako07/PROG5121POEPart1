package registration.and.login;

public class Registration {

    // Validate username
    public static boolean validateUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Validate password (includes special character)
    public static boolean validatePassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[^a-zA-Z0-9].*");
    }
    // Validate phone number
    public static boolean validatePhoneNumber(String phone) {
        return phone.matches("^0\\d{9}$") || phone.matches("^\\+27\\d{9}$");
    }
}