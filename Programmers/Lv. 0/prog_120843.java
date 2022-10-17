class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int index = 0;
        
        index += 2 * (k-1);
        
        answer = numbers[index % numbers.length];
        
        return answer;
    }
}
