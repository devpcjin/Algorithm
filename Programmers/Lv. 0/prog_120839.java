class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] s = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("2")) {
                sb.append("0");
            }else if(s[i].equals("0")) {
                sb.append("5");
            }else if(s[i].equals("5")) {
                sb.append("2");
            }
        }
        answer = sb.toString();
        return answer;
    }
}
