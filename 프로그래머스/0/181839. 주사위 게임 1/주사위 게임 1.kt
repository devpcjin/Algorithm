class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        
        if(a%2 != 0 && b%2 != 0) answer = a*a + b*b
        else if(a%2 != 0 || b%2 != 0) answer = 2*(a+b)
        else answer = if(a-b < 0) (-1)*(a-b) else a-b

        return answer
    }
}