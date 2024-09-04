class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        queries.forEach { v1 ->
            (v1[0]..v1[1]).forEach {
                answer[it]++
            }
        }
        
        return answer
    }
}