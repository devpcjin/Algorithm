class Solution {
    public double solution(int balls, int share) {
        double answer = 0;
        int min = 0;
        if((balls-share) > share) {
            min = share;
        }else {
            min = balls-share;
        }
        
        double a = 1;
        double b = 1;
        
        for(int i = 1; i <= min; i++) {
            a *= balls;
            balls--;
        }
        
        for(int i =1; i<=min; i++) {
            b *= i;
        }
        
        answer = a/b;
        
        return answer;
    }
}
