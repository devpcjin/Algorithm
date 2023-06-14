import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] completion = new int[progresses.length];
        
        for(int i = 0; i < progresses.length; i++) {
            if((100-progresses[i])%speeds[i]!=0){
                completion[i] = (100-progresses[i])/speeds[i] + 1;
            } else {
                completion[i] = (100-progresses[i])/speeds[i];
            }
        }
        int leftDays = completion[0];
        int count = 0;
        for(int i = 0; i < completion.length; i++){
            if(leftDays >= completion[i]) {
                count++;
            } else {
                leftDays = completion[i];
                answer.add(count);
                count = 1;
            }
        }
        answer.add(count);
        return answer;
    }
}