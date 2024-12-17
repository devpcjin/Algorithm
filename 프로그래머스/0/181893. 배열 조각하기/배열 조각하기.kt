class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer: IntArray = arr
        
        for((idx, num) in query.withIndex()) {
            if(idx % 2 == 0) {
                answer = answer.slice(0..num).toIntArray()
            } else {
                answer = answer.drop(num).toIntArray()
            }
            
        }
        return answer
    }
}