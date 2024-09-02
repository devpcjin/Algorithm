class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        
        val aSumB = (a.toString()+b.toString()).toInt()
        val bSumA = (b.toString()+a.toString()).toInt()
        
        answer = maxOf(aSumB, bSumA)
        
        return answer
    }
}