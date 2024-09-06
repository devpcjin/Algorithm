class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        
        queries.forEach { (start, end) ->
            if (start == 0) {
                answer = answer.substring(start, end+1).reversed() + answer.substring(end+1)
            } else if (end == my_string.length - 1) {
                answer = answer.substring(0, start) + answer.substring(start).reversed()
            } else {
                answer = answer.substring(0, start) +
                         answer.substring(start, end + 1).reversed() +
                         answer.substring(end + 1)
            }
        }
        
        return answer
    }
}