import java.util.ArrayList;
import java.io.*;

class Solution {
    public int solution(int[][] dots) {
        
        int answer = 0;
        
        ArrayList <Double> check = new ArrayList <> ();
        
        for(int i = 0; i < dots.length; i++) {
            for(int j = i+1; j < dots.length; j++) {
                
                double lean = (double)((double)dots[i][1] - (double)dots[j][1]) / ((double)dots[i][0]-(double)dots[j][0]);
                
                //문모 분자가 0일 때, 추가
                if (((double)dots[i][0]-(double)dots[j][0]) == 0) {
                    lean = 0;
                } else if ((double)dots[i][1] - (double)dots[j][1] == 0) {
                    lean = -999;
                }
                
                if(check.contains(lean)) {
                    return 1;
                }
                check.add(lean);
            }
        }
        
        
        return 0;
        
    }
}
