package week_6.Question1_passwordValidation;

public class Ayoub {
    public static void main(String[] args) {


        String password= "fsou@9";

        if(password.length()>=6){ //Password MUST be at least have 6 characters
            int freq=0;
            for (int i =0; i <password.length(); i++) {
                char letter= password.charAt(i);
                if (33<=letter && letter<=47 || 58<=letter && letter<=64){
                    freq++;
                    continue;
                    // 4. Password should at least contain one special characters,
                    //should not contain space
                }

                if (48<=letter && letter<=57){          //Password should at least contain a digit.
                    freq++;
                    continue;
                }
                if (65<=letter && letter<=90){          //2. Password should at least contain one upper case letter,
                    freq++;
                    continue;
                }
                if (97<=letter && letter<=122){        // 3. PassWord should at least contain one lowercase letter,
                    freq++;
                    continue;
                }



            }
            System.out.println(freq);
        }




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