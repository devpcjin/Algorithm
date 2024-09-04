class Solution {
    fun solution(strArr: Array<String>): Int {
        
        var list = MutableList<Int>(30) { 0 }
        
        strArr.forEach { list[it.length-1]++ }
        
        
        
        return list.maxOrNull() ?: 0
    }
}