class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        var answer: Int = 0
        if(my_string == is_suffix) return 1
        if(my_string.length>is_suffix.length && my_string.slice(my_string.length-is_suffix.length until my_string.length) == is_suffix) answer = 1
        
        return answer
    }
}