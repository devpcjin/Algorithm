class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int a = 0;
        
        if (num % 2 == 0) {
            a = total/num;
            a -= (num/2)-1;
        } else {
            a = total/num;
            a -= (num/2);
        }
        
        for(int i = 0; i < num; i++) {
            answer[i] = a;
            a++;
        }
        
        return answer;
    }
}
