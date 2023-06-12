package week_3.question2;

public class Ayoub {
    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-987654));

    }
    public static int reverseNegativeNumber(int number) {
        int restult=0;
        if(number<0){
            String num1 = String.valueOf(number);

            String num2 = "";
            for (int i = num1.length() - 1; i > 0; i--) {
                num2 += num1.charAt(i) + "";
            }
            int reverseNumber = Integer.parseInt(num2);
            restult= reverseNumber * (-1);}
       return restult;

    }


}
/*Numbers -- Reverse Negative Number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -123  output: -321

     */