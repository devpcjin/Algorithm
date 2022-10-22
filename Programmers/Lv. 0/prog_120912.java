class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        
        String myString = sb.toString();
        
        answer = myString.length() - myString.replace("7","").length();
        
        return answer;
    }
}
