class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        arr.forEach {
            if(answer.isEmpty()) answer += it
            else if(answer.last() == it) answer = answer.dropLast(1).toIntArray()
            else answer += it
        }
        
        return if(answer.isEmpty()) intArrayOf(-1) else answer
    }
}