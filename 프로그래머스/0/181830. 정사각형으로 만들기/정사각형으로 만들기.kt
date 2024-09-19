import kotlin.math.*

class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        
        val row = arr.size
        val column = arr[0].size
        
        if(row >= column) {
            return arr.map { 
                it + IntArray(row-column)
            }.toTypedArray()
        } else if(row < column) {
            return arr + Array(column - row) { IntArray(column) }
        } else {
            return arr
        }
        
    }
}