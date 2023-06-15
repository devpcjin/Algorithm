import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int completion = 0;
        int i = 0;
        int end = 0;
        
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> pQueue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        while(completion < jobs.length) {
            while (i < jobs.length && jobs[i][0] <= end) {
				pQueue.add(jobs[i++]);
			}
            if(pQueue.isEmpty()){
                end = jobs[i][0];
            } else {
                int[] done = pQueue.poll();
                answer += done[1] + end - done[0];
                end += done[1];
                completion++;
            }
        }
        
        answer = answer / jobs.length;
        
        return answer;
    }
}