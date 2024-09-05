class Solution {
    fun solution(my_string: String): IntArray {
        var answer = MutableList<Int>(52) {0}
        
        my_string.forEach {
            if(it.code >= 97) answer[it.code-71]++
            else answer[it.code-65]++
        }
        
        return answer.toIntArray()
    }
}