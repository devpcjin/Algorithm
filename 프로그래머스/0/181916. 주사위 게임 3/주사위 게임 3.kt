import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
        
        val resultList: List<Int> = listOf(a,b,c,d)
        val resultMap: Map<Int, Int> = resultList.groupingBy {it}.eachCount()
        
        return when(resultMap.size) {
            1 ->  1111 * a
            2 -> {
                val (p, q) = resultMap.entries.sortedByDescending { it.value }.map { it.key }
                if(resultMap[p] == 3) {
                    (10*p+q)*(10*p+q)
                } else {
                    (p+q)*abs(p-q)
                }
            }
            3 -> {
                val (p, q, r) = resultMap.entries.sortedByDescending { it.value }.map { it.key }
                q*r
            }
            else -> resultList.minOrNull() ?: 0
        }
        
        return answer
    }
}
