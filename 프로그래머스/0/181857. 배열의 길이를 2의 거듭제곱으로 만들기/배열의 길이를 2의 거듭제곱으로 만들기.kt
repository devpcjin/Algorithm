class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr
        var n = 1
        
        while(arr.size > n) {
            n *= 2
        }
        
        return answer + IntArray(n-arr.size) { 0 }
    }
}