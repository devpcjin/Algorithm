class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = -1
        
        for((index, value) in num_list.withIndex()) {
            if(value<0) return index
        }
        return answer
    }
}