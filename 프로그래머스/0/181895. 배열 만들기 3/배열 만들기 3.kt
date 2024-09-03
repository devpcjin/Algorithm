class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        
        return intervals.map { (start, end) -> arr.slice(start..end) }.flatten().toIntArray()
    }
}