class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        
        return (idx until arr.size).find { arr[it]==1 } ?: -1
    }
}