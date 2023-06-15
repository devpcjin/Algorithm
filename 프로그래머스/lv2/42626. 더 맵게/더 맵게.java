import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        
        for(int food: scoville) {
            pQueue.offer(food);
        }
        
        while(pQueue.peek() < K){
            if(pQueue.size() == 1) {
                return -1;
            }
            
            int min = pQueue.poll();
            int min2 = pQueue.poll();
            
            int sum = min + (min2 * 2);
            
            pQueue.offer(sum);
            answer++;
        }
               
        return answer;
    }
}