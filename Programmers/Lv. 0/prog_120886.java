import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] charsBefore = before.toCharArray();
        char[] charsAfter = after.toCharArray();
        
        Arrays.sort(charsBefore);
        Arrays.sort(charsAfter);
        
        String strBefore = new String(charsBefore);
        String strAfter = new String(charsAfter);
        
        if(strBefore.equals(strAfter)) {
            answer = 1;
        }
        
        return answer;
    }
}
