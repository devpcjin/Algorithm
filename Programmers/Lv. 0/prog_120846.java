class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i = 1; i <= n; i++) {
            if(!isPrime(i)) {
                count++;
            }
        }
        
        answer = count;
        
        return answer;
    }
    
    public boolean isPrime(int num) {
        boolean result = true;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                result = false;
                break;
            } else {
            result = true;
            } 
        }
        
        return result;
    }
}
