import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int a = 100;
        
        int b = 0;
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            b = Math.abs(array[i] - n);
            if (b < a) {
                answer = array[i];
                a = b;
            }
        }
        
        return answer;
    }
}
