class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        
        return queries.map { (s, e, k) -> 
            val selectedArr = arr.slice(s..e).sorted()
            
            selectedArr.filter { v -> v > k }.minOrNull() ?: -1
        }.toIntArray()
    }
}