class Solution {
    String[] cant = {"ayaaya", "yeye", "woowoo", "mama"};
    String[] can = {"aya", "ye", "woo", "ma"};
    
    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {
            String temp = str;
            for (String ban : cant) {
                temp = temp.replace(ban, "x");
            }
            for (String speak : can) {
                temp = temp.replace(speak, "");
            }
            if (temp.length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}
