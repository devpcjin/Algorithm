class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int x = 0, y = 0, z = 0;
        
        x = box[0] / n;
        y = box[1] / n;
        z = box[2] / n;
        
        answer = x * y * z;
        
        return answer;
    }
}
