class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp > 2){
            if(hp > 5) {
                answer += hp/5;
                hp = hp%5;
            }else {
                answer += hp/3;
                hp = hp%3;
            }
        }
        answer += hp;
        return answer;
    }
}
