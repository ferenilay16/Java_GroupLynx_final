package week_6.Question1_passwordValidation;

public class Antonio {

    public static boolean validPassword(String password) {

        // if we have at least one true then password will be invalid

        if ((password.length() < 6) ||
                (password.contains(" ")) ||
                (!password.matches(".*[A-Z].*")) ||
                (!password.matches(".*[a-z].*")) ||
                (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) ||
                (!password.matches(".*\\d.*"))) {
            return false;
        }
        return true; // if all requirements are met
    }

    public static void main(String[] args) {
        System.out.println(validPassword("Aa222dfhdfhfdhdf"));
    }

}
