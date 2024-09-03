class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        if( n%2 == 0) {
            answer = (2..n step 2).map {it*it}.sum()
        }else {
            answer = (1..n step 2).sum()
        }
        return answer
    }
}