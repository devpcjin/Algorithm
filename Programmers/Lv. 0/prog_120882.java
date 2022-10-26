import java.util.*;
class Solution {
    
    public int[] solution(int[][] score){
        int[] answer = new int[score.length];
        float[] avg = new float[score.length];
        
        for(int i = 0; i < score.length; i++)
            avg[i] = (float)(score[i][0] + score[i][1])/2;
        
        for(int i = 0; i < score.length; i++){
            answer[i] = 1;
            for(int j = 0; j < avg.length; j++){
                if(avg[i] < avg[j])
                    answer[i]++;
            }
        }
        return answer;
    }
}
