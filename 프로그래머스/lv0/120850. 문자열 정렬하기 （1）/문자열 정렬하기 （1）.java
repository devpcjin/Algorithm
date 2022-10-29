import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) < 65) {
                sb.append(my_string.charAt(i));
            }
        }
        
        int[] answer = new int[sb.length()];
        
        for(int i = 0; i < sb.length(); i++) {
            answer[i] = (sb.charAt(i)-48);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}