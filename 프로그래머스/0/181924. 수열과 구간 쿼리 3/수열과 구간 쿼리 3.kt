class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        queries.forEach { (i, j) ->
            val temp = answer[i]
            answer[i] = answer[j]
            answer[j] = temp
        }
        return answer
    }
}