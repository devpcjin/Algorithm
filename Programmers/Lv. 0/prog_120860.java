import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int xF = dots[0][0], yF = dots[0][1];
        int x = 0, y = 0;
        
        for(int i = 1; i < 4; i++) {
            if(dots[i][0] != xF && dots[i][1] != yF) {
                x = xF - dots[i][0];
                y = yF - dots[i][1];
            }
        }
        
        answer = Math.abs(x * y);
        
        return answer;
    }
}
