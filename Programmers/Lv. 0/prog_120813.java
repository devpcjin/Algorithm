import java.util.Arrays;

class Solution {
    private static int[] append(int[] arr, int element)
    {
        int[] array = new int[arr.length + 1];
        System.arraycopy(arr, 0, array, 0, arr.length);
        array[arr.length] = element;
        return array;
    }
    public int[] solution(int n) {
        int[] answer = {};
        int i = 1;
        while(i <= n){
            answer = append(answer, i);
            i += 2;
        }
        return answer;
    }
}
