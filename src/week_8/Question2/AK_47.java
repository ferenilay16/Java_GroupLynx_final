package week_8.Question2;

public class AK_47 {


    class Solution {
        public int[] sumZero(int n) {
            int[] answer = new int[n];
            int index = 0;

            if (n % 2 == 1)
                answer[index++] = 0;

            n /= 2;

            for (int i = 1; i <= n; i++) {
                answer[index++] = i;
                answer[index++] = -i;
            }

            return answer;
        }
    }

    /*
    Array - N unique integers that sum up to 0
    Write a function that given an integer N (1 < N < 100), returns an array
    containing N unique integers that sum up to 0. The function can return any such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

}
