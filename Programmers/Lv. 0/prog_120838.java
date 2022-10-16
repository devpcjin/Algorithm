import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String a = "";
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(letter);
        while(st.hasMoreTokens()) {
            a = st.nextToken().toString();
            
            if(a.equals(".-")){
                sb.append("a");
            }else if(a.equals("-...")) {
                sb.append("b");
            }else if(a.equals("-.-.")) {
                sb.append("c");
            }else if(a.equals("-..")) {
                sb.append("d");
            }else if(a.equals(".")) {
                sb.append("e");
            }else if(a.equals("..-.")) {
                sb.append("f");
            }else if(a.equals("--.")) {
                sb.append("g");
            }else if(a.equals("....")) {
                sb.append('h');
            }else if(a.equals("..")) {
                sb.append("i");
            }else if(a.equals(".---")) {
                sb.append("j");
            }else if(a.equals("-.-")) {
                sb.append("k");
            }else if(a.equals(".-..")) {
                sb.append("l");
            }else if(a.equals("--")) {
                sb.append("m");
            }else if(a.equals("-.")) {
                sb.append("n");
            }else if(a.equals("---")) {
                sb.append("o");
            }else if(a.equals(".--.")) {
                sb.append("p");
            }else if(a.equals("--.-")) {
                sb.append("q");
            }else if(a.equals(".-.")) {
                sb.append("r");
            }else if(a.equals("...")) {
                sb.append("s");
            }else if(a.equals("-")) {
                sb.append("t");
            }else if(a.equals("..-")) {
                sb.append("u");
            }else if(a.equals("...-")) {
                sb.append("v");
            }else if(a.equals(".--")) {
                sb.append("w");
            }else if(a.equals("-..-")) {
                sb.append("x");
            }else if(a.equals("-.--")) {
                sb.append("y");
            }else if(a.equals("--..")) {
                sb.append("z");
            }
        }
        
        answer = sb.toString();
        
        
        return answer;
    }
}
