class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        
        return arr.mapIndexed { i, v1 ->
            var newValue = v1
            queries.forEach { v2 ->
                if (i >= v2[0] && i <= v2[1] && i % v2[2] == 0) {
                    newValue += 1
                }
            }
            newValue
        }.toIntArray()
    }
}