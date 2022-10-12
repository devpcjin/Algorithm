class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        int pizza = 6;
        
        while((pizza%n) != 0){
            count++;
            pizza += 6;
        }
        answer = count;
        return answer;
    }
}
