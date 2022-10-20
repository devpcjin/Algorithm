class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if(a > 96){
                a -= 32;
            }else {
                a += 32;
            }
            
            sb.append(a);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
