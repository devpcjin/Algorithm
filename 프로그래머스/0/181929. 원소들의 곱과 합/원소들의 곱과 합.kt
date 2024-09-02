class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        var sum: Int = 0
        var mul: Int = 1
        
        for(i in num_list) {
            sum += i
            mul *= i
        }
        
        if(mul < sum*sum) answer = 1
        
        return answer
    }
}