import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int sum = sides[0] + sides[1];
        
        for(int i = 0; i <= sides[1]; i++) {
            if(i + sides[0] > sides[1]) {
                answer++;
            }
        }
        
        for(int i = sides[1]+1; i < sum; i++) {
            answer++;
        }
        
        return answer;
    }
}
