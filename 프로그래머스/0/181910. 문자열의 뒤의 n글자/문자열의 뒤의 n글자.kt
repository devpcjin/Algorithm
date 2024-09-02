class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        
        answer = my_string.takeLast(n)
        return answer
    }
}