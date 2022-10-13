class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int count = 0;
        int changes = 0;
        
        count = money / 5500;
        changes = money % 5500;
        
        answer[0] = count;
        answer[1] = changes;
    
        return answer;
    }
}
