import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int cal = sides[2] - (sides[0]+sides[1]);
        
        if(cal < 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}
