class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        val a = num_list.slice(0..n-1)
        val b = num_list.slice(n until num_list.size)
        answer = (b + a).toIntArray()
        
        return answer
    }
}