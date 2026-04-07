package registration.and.login;

import java.util.Scanner;

public class Login {

    private String storedUsername;
    private String storedPassword;

    // Username validation
    public boolean checkUserName(String username) {
        return Registration.validateUsername(username);
    }

    // Password validation
    public boolean checkPasswordComplexity(String password) {
        return Registration.validatePassword(password);
    }

    // Phone validation
    public boolean checkCellPhoneNumber(String phone) {
        return Registration.validatePhoneNumber(phone);
    }

    // Register user
    public boolean registerUser(String username, String password, String phone) {

        boolean valid = true;

        // Username check
        if (checkUserName(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is incorrectly formatted. Please ensure it contains an underscore (_) and is no more than 5 characters.");
            valid = false;
        }

        // Password check
        if (checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted. Please ensure it is at least 8 characters long, contains a capital letter, a number, and a special character.");
            valid = false;
        }

        // Phone check
        if (checkCellPhoneNumber(phone)) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            valid = false;
        }

        // Final registration
        if (valid) {
            storedUsername = username;
            storedPassword = password;

            System.out.println("Registration successful!");
            System.out.println("Stored username: " + storedUsername);
            System.out.println("Stored password: " + storedPassword);
        }

        return valid;
    }

    // Login user
    public boolean loginUser(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    // Return login message
    public String returnLoginStatus(boolean status, String username) {
        if (status) {
            return "Welcome " + username + ", it is great to see you again!";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        // Registration
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        boolean registered = login.registerUser(username, password, phone);

        // Login
        if (registered) {
            System.out.print("\nEnter username: ");
            String loginUser = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            boolean loginStatus = login.loginUser(loginUser, loginPass);
            System.out.println(login.returnLoginStatus(loginStatus, loginUser));
        }

        scanner.close();
    }
}