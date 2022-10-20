class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = code-1; i < cipher.length(); i+=code) {
            char a = cipher.charAt(i);
            
            sb.append(a);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
