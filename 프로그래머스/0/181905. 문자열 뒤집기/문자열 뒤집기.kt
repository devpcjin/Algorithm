class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        return my_string.substring(0,s) + my_string.substring(s,e+1).reversed() + my_string.substring(e+1, my_string.length)
    }
}