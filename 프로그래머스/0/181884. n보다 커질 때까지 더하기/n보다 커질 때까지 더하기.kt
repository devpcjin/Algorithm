class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        
        for(i in numbers) {
            answer += i
            if(answer > n) return answer
        }
        return answer
    }
}