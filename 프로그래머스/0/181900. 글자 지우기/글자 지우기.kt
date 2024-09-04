class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        
        return my_string.mapIndexed { i,v -> if(i in indices) "" else v}.joinToString("")
    }
}