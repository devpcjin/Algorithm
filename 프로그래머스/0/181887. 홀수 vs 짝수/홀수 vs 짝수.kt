class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        var oddIdxSum: Int = 0
        var evenIdxSum: Int = 0
        
        for((i, v) in num_list.withIndex()) {
            if(i % 2 == 0) evenIdxSum += v
            else oddIdxSum += v
        }
        
        answer = maxOf(oddIdxSum, evenIdxSum)
        return answer
    }
}