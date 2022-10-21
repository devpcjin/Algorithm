import java.util.ArrayList;
import java.util.StringTokenizer;

class Solution {
    public ArrayList<String> solution(String[] quiz) {
        ArrayList<String>  answer = new ArrayList<> ();
        
        for(int i = 0; i < quiz.length; i++) {
            StringTokenizer st = new StringTokenizer(quiz[i]);
            int sumNum = Integer.parseInt(st.nextToken());
            if(st.nextToken().equals("+")) {
                sumNum += Integer.parseInt(st.nextToken());
            } else {
                sumNum -= Integer.parseInt(st.nextToken());
            }
            
            st.nextToken();
            
            if(sumNum  == Integer.parseInt(st.nextToken())) {
                answer.add("O");
            }else {
                answer.add("X");
            }
        }
        
        return answer;
    }
}
