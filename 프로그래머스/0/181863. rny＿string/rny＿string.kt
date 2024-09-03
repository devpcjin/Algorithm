class Solution {
    fun solution(rny_string: String): String {
        var answer: String = ""
        
        answer = rny_string.map { if(it=='m') "rn" else it }.joinToString("")
        return answer
    }
}