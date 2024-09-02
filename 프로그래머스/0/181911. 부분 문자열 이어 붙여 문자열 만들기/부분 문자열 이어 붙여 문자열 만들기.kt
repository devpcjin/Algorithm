class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        
        for((index, value) in my_strings.withIndex()) {
            answer += value.slice(parts[index][0]..parts[index][1])
        }
        return answer
    }
}