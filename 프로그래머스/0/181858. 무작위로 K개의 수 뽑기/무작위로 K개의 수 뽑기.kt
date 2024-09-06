class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        arr.forEach {
            if(!answer.contains(it) && answer.size < k) answer += it
        }
        
        (answer.size until k).forEach { answer += -1}
        return answer
    }
}