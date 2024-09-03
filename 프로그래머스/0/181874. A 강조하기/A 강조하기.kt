class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        
        answer = myString.toLowerCase().replace("a","A")
        return answer
    }
}