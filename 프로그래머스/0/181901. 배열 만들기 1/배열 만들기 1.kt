class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(i in 1..n/k) {
            answer += k * i
        }
        return answer
    }
}