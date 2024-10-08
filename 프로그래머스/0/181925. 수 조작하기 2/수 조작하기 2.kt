class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        
        for(i in 1 until numLog.size) {
            answer += when(numLog[i] - numLog[i-1]) {
                1 -> "w"
                -1 ->  "s"
                10 -> "d"
                else -> "a"
            }
        }
        
        return answer
    }
}