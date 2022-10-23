class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String s = "";
        
        String[] splitPolymial = polynomial.split(" ");
        int[] num  = {0,0};
        
        for(int i = 0; i < splitPolymial.length; i++) {
            if(splitPolymial[i].contains("x")) {
                s = splitPolymial[i].replace("x", "");
                if(s.equals("")){
                    num[0] += 1;
                }else {
                    num[0] += Integer.parseInt(s);
                }
            } else if (!splitPolymial[i].equals("+")) {
                num[1] += Integer.parseInt(splitPolymial[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(num[0] != 0) {
            if(num[0] == 1) {
                sb.append("x");
            } else {
                sb.append(num[0]).append("x");
            }
            if(num[1] != 0) {
                sb.append(" + ");
            }
        }
        
        if(num[1] != 0) {
            sb.append(num[1]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
