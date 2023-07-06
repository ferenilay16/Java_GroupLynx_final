package week_6.Question1_passwordValidation;

public class Medet {
    public static boolean PasswordValidation(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        // Check if the password length is at least 6 characters and does not contain a space

        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }
        // Check if the password contains at least 1 uppercase letter

        boolean hasLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            return false;
        }
        // Check if the password contains at least 1 lowercase letter

        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }
        // Check if the password contains at least 1 special character

        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }
        // Check if the password contains at least 1 digit

        return true;
        // If all the checks pass, the password is valid
    }

    public static void main(String[] args) {
        String password = "Abc123!"; // <-- We can check with any password HERE
        boolean isValid = PasswordValidation(password);
        System.out.println("Is password valid: " + isValid);
    }
}


/*
  Password Validation Task:
  Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
    5. Password should at least contain a digit.

  if all requirements above are met, the method returns true, otherwise returns false.
*/
