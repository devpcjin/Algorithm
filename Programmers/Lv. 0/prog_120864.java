class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] stringSplit = my_string.split("[a-zA-Z]");
        for(int i = 0; i < stringSplit.length; i++) {
            if(!stringSplit[i].equals("")) {
                answer += Integer.parseInt(stringSplit[i]);
            }
        }
        
        return answer;
    }
}
