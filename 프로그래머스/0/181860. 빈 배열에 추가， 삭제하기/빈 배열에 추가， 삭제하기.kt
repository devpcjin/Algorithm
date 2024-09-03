class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        flag.forEachIndexed {
            i, v -> 
            if(v) {
                repeat(arr[i]*2) {
                    answer += arr[i]
                }
            }
            else {
                answer = answer.slice(0 until answer.size-arr[i]).toIntArray()
            }
        }
        return answer
    }
}