import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        
        HashSet<Integer> numsHashSet = new HashSet<>();
        
        for(int num : nums) {
            numsHashSet.add(num);
        }
        
        if(numsHashSet.size() < answer) answer = numsHashSet.size();
        
        return answer;
    }
}