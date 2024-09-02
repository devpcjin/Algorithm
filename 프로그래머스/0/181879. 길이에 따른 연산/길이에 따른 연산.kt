class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        if(num_list.size >= 11) {
            for(i in num_list) {
                answer += i
            }
        } else {
            answer = 1
            for(i in num_list) {
                answer *= i
            }
        }
        
        return answer
    }
}