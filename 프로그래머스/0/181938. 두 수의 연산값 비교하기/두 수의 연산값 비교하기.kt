class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        
        var customSum: Int = (a.toString() + b.toString()).toInt()
        var compare = 2*a*b
        
        if(customSum >= compare) answer = customSum
        else answer = compare
        
        return answer
    }
}