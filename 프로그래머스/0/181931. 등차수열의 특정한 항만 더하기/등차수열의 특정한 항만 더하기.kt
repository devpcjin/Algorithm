class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        
        return included.mapIndexed { i, v -> if(v) a+i*d else 0}.sum()
    }
}