class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk: IntArray = intArrayOf()
        var index: Int = 0;
        
        while(index < arr.size) {
            
            if(stk.isEmpty() || stk.last() < arr[index]) {
                stk += arr[index]
                index++;
            }
            else {
                stk = stk.dropLast(1).toIntArray()
            }
        }
        
        return stk
    }
}