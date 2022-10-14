import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] emergencyAsc = new int[emergency.length];
        
        for (int i = 0; i < emergency.length; i++) {
            emergencyAsc[i] = emergency[i];
        }
        
        Arrays.sort(emergencyAsc);
        
        for(int i = 0; i < emergencyAsc.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergencyAsc[i] == emergency[j]){
                    answer[j] = emergency.length - i;
                }
            }
        }
        
        return answer;
    }
}
