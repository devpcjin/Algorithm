class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var arrX = arr
        var arrX1 = intArrayOf()
        
        do {
            
            
            arrX1 = arrX.map {if(it>= 50 && it%2 == 0) it/2 else if(it<50 && it%2 == 1) it*2 + 1 else it}.toIntArray()
            
            if(arrX.contentEquals(arrX1)) return answer
            
            answer++
            
            arrX = arrX1
            
        } while (true)
        
        return answer
    }
}