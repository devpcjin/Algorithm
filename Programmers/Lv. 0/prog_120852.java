import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                if(n%i == 0) {
                    answer.add(i);
                }
            }
        }
        
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
