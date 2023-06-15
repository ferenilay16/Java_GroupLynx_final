package week_3.question1_primeNumber;

public class Ayoub {
    public static void main(String[] args) {

        checkNumber(18);
    }

      public static void checkNumber(int n){

        if(n>=2){
            String result= n+" is a prime number";
            for (int i=2;  i<n ; i++) {
                if(n%i==0){

                    result=n+" is Not a prime number";
                }
            }
            System.out.println(result);

        }



        }




      }










/*
    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not
     */