class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        
        var map = mutableListOf<Pair<Int, Int>>()
        
        attendance.forEachIndexed { i, v -> 
            if(v) map.add(Pair(rank[i], i))
        }
        
        val sortedMap = map.sortedBy { it.first }
        val top3 = sortedMap.take(3).map { it.second }
        
        return top3[0] * 10000 + top3[1] * 100 + top3[2]
    }
}