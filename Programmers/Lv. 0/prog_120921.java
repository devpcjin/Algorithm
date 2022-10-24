class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        for (int i = 0; i <= B.length(); i++) {
            if (A.equals(B)) {
                return answer;
            }
            answer++;
            A = A.charAt(A.length() - 1) + A.substring(0, A.length()-1);
        }
        return -1;
    }
}
