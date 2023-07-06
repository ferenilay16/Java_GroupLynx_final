package week_6.Question1_passwordValidation;

public class Thi {
//! INCOMPLETE

    public static boolean validPassword(String password){
        if (password.length() <6 || password.contains(" ") || !password.matches("^?=.*[A-Z]") || !password.matches("^?=.*[a-z]") || !password.matches("^?=.*[!@#&()–[{}]:;',?/*~$^+=<>]].{8,20}$") || !password.matches("^?=.*[0-9]")){
            return false;
        }
        return true;

        /*for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (('A' <= ch && ch <= 'Z')
                    && ('a' <= ch && ch <= 'a')
                    && ('!' <= ch && ch <= '/')
                    && ('0' <= ch && ch <= 9)){
                return false;
            }
        }

         */
    }

    public static void main(String[] args) {
        System.out.println("validPassword(\"password\") = " + validPassword("pass"));
        System.out.println("validPassword(\"Pass word\") = " + validPassword("Pass word"));
        System.out.println("validPassword(\"Password\") = " + validPassword("Password"));
        System.out.println("validPassword(\"Password1\") = " + validPassword("Password1"));
        System.out.println("validPassword(\"Password1!\") = " + validPassword("Password1!"));
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