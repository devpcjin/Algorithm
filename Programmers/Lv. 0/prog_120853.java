import java.util.StringTokenizer;
import java.util.ArrayList;

class Solution {
    
    public int solution(String s) {
        int answer = 0;
        
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        while(st.hasMoreTokens()) {
            String a = st.nextToken();
            if(a.equals("Z")) {
                arrayList.remove(arrayList.size()-1);
            }else {
                arrayList.add(Integer.parseInt(a));
            }
        }
        
        for(int i = 0; i < arrayList.size(); i++) {
            answer += arrayList.get(i);
        }
        
        return answer;
    }
     
}
