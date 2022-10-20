class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char c1 = my_string.charAt(num1);
        char c2 = my_string.charAt(num2);
        
        char[] chars = my_string.toCharArray();
        
        chars[num1] = c2;
        chars[num2] = c1;
        
        answer = String.valueOf(chars);
        
        return answer;
    }
}
