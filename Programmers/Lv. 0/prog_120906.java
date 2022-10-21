import java.util.stream.Stream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] numArray = Stream.of(String.valueOf(n).split(""))
	       .mapToInt(Integer::parseInt)
               .toArray();
        
        for(int i = 0; i < numArray.length; i++) {
            answer += numArray[i];
        }
        
        return answer;
    }
}
