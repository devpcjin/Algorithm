class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        var answer: Int = 0
        if(my_string.length > is_prefix.length)
            if(my_string.slice(0..is_prefix.length-1).toString() == is_prefix) answer = 1
        return answer
    }
}