import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] avg = new int[score.length];
        
        
        for(int i = 0; i < score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2;
        }
        
        
        //동일점수 중복 제거
        ArrayList<Integer> avgDuplicate = new ArrayList<> ();
        
        for(int item : avg) {
            if(!avgDuplicate.contains(item)) {
                avgDuplicate.add(item);
            }
        }
        Collections.sort(avgDuplicate, Collections.reverseOrder());
        
        int rank = 1;
        int same = 0;
        
        for(int i = 0; i < avgDuplicate.size(); i++) {
            same = 0;
            for(int j = 0; j < avg.length; j++) {
                if(avg[j] == avgDuplicate.get(i)) {
                    answer[j] = rank;
                    same++;
                }
            }
            rank += same;
        }
        
        return answer;
    }
}
