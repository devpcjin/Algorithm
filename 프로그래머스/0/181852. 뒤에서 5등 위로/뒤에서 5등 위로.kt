class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        num_list.sort()
        
        answer = num_list.filterIndexed { i,v -> i > 4}.toIntArray()
        return answer
    }
}