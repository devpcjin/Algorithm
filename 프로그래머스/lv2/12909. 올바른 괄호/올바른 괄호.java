import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i <= s.length()-1; i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')') {
                if(stack.empty()) {
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }
        
        if(!stack.empty()){
            answer = false;
        }

        return answer;
    }
}