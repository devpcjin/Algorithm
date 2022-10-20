import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        int[] count = new int[25];
        Arrays.fill(count, 0);
        
        for(int i = 0; i < s.length(); i++) {
            count[(int)s.charAt(i)-97]++;
        }
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] == 1) {
                sb.append((char)(i+97));
            }
        }
        
        answer = sb.toString();    
        
        return answer;
    }
}
