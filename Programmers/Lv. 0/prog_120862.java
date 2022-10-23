import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int length = numbers.length;
        
        if(numbers[0] < 0 && numbers[1] < 0) {
            if(numbers[0]*numbers[1] > numbers[length-1] * numbers[length-2]) {
                answer = numbers[0]*numbers[1];
            } else {
                answer = numbers[length-1] * numbers[length-2];
            }
        }else {
            answer = numbers[length-1] * numbers[length-2];
        }
        
        return answer;
    }
}
