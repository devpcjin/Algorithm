import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        
        val resultList: List<Int> = listOf(a,b,c,d)
        val resultMap: Map<Int, Int> = resultList.groupingBy {it}.eachCount()
        
        val (p, q, r, s) = resultMap.entries.sortedByDescending { it.value }.map { it.key }.let { it + List(4 - it.size) { 0 } }
        
        return when {
            s != 0 -> minOf(p, q, r, s)
            r != 0 -> q*r
            resultMap[p] == 3 -> (10*p+q)*(10*p+q)
            resultMap[q] == 2 -> (p+q)*abs(p-q)
            else -> 1111*p
        }
    }
}
