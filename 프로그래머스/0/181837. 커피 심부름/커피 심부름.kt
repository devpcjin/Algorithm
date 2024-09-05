class Solution {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0
        
        order.forEach {
            if(it.contains("cafelatte")) answer += 5000
            else answer += 4500
        }
        return answer
    }
}