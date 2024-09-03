class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        var answer: Int = 0
        
        if(n in num_list) answer = 1
        return answer
    }
}