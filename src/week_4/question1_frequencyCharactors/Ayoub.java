package week_4.question1_frequencyCharactors;

public class Ayoub {
    public static void main(String[] args) {

        frequencyOfChars("AAABBCDD");
    }
    public static void frequencyOfChars(String str){
        String result="";
        for (int j = 0; j <str.length() ; j++) {
            int freq=0;
            char ch1=str.charAt(j);//A
            for (int i = 0; i < str.length(); i++) {
                char ch2 =str.charAt(i);//A==A
                if(ch2==ch1){
                    freq++;
                }
            }
            if(result.contains(ch1+"")){
                continue;
            }
              result=freq+""+ch1;
            System.out.print(result);
        }



    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */