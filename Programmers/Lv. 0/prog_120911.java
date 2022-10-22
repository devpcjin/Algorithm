import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] a = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            if((int)my_string.charAt(i) < 91){
                a[i] = (char)((int)my_string.charAt(i)+32);
            }else {
                a[i] = my_string.charAt(i);
            }
        }
        
        Arrays.sort(a);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
