import java.util.*;

public class Solution {
    public  ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int checkNum = arr[0];
        
        answer.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(checkNum != arr[i]){
                checkNum = arr[i];
                answer.add(arr[i]);
            }
        }
        
        
        return answer;
    }
}