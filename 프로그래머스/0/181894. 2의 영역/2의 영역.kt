class Solution {
    fun solution(arr: IntArray): IntArray {
        
        val indices = arr.mapIndexed { i, v -> if (v == 2) i else null }.filterNotNull()
        
        return if(indices.isEmpty()) intArrayOf(-1) else arr.slice(indices[0]..indices.last()).toIntArray()
    }
}