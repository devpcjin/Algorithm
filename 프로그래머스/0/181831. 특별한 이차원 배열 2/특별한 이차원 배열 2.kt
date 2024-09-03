class Solution {
    fun solution(arr: Array<IntArray>): Int {
        
        for((i, v) in arr.withIndex()) {
            for((j, x) in arr. withIndex()) {
                if(i!=j && arr[i][j] != arr[j][i]) {
                    return 0
                }
            }
        }
        
        return 1
    }
}