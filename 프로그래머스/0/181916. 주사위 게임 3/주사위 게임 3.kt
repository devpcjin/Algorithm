import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
        
        val resultList: List<Int> = listOf(a,b,c,d)
        val resultMap: Map<Int, Int> = resultList.groupingBy {it}.eachCount()
        
        var p:Int = 0
        var q:Int = 0
        var r:Int = 0
        
        var checker:Boolean = false
        
        when(resultMap.size) {
            1 -> answer = 1111 * a
            2 -> {
                resultMap.forEach {
                    if(it.value == 3) { 
                        checker = true
                        p = it.key
                    }
                    else if(it.value == 2 && p == 0) p = it.key
                    else if(it.value == 2 && q == 0) q = it.key
                    else if(it.value ==1) q = it.key
                }
                answer = if(checker) (10*p+q)*(10*p+q) else (p+q)*abs(p-q)
            }
            3 -> {
                resultMap.forEach {
                    if(it.value == 2) p = it.key
                    else if(q == 0) q = it.key
                    else r = it.key
                }
                answer = q*r
            }
            else -> answer = resultList.minOrNull() ?: 0
        }
        
        return answer
    }
}
