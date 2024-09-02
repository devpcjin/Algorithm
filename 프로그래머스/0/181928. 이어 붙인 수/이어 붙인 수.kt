class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        val odd = num_list.filter { it%2 != 0}.joinToString("").toInt()
        val even = num_list.filter { it%2 == 0}.joinToString("").toInt()
        
        answer = odd + even
        return answer
    }
}