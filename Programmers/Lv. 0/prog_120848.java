class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        
        while(factorial(a) <= n) {
            
            a++;
        }
        
        answer = a-1;
        
        return answer;
    }
    
    public int factorial(int n) {
        int result = 1;
        
        for(int i = 1; i <= n ; i++) {
            result *= i;
        }
        
        return result;
    }
}
