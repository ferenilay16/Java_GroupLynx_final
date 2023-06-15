package week_1.question_1_evenOrOdd;

public class Nilay {
         public static void oddOrEvenNumber(int number){
            if (number%2==0){
                System.out.println(number + " is Even");
            }else{
                System.out.println(number+ " is Odd");
            }
        }

        public static void main(String[] args) {
            oddOrEvenNumber(100);
            oddOrEvenNumber(3);
        }

    }



