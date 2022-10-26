class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        int couponOrder = 0;
        int couponLeft = chicken;
        
        while(couponLeft >= 10) {
            couponOrder = (couponLeft/10);
            answer += couponOrder;
            couponLeft = couponOrder + (couponLeft%10);
        }
        
        return answer;
    }
}
