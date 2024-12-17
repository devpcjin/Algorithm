class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = Array(n) {IntArray(n)}
        
        var number:Int  = 1
        
        var left:Int = 0
        var right:Int = n-1
        var top:Int = 0
        var bottom:Int = n-1
        
        while(left <= right && top <= bottom) {
            
            for(i in left..right) {
                answer[top][i] = number
                number++
            }
            top++
            
            for(i in top..bottom) {
                answer[i][right] = number
                number++
            }
            right--
            
            if(top <= bottom) {
                for(i in right downTo left) {
                    answer[bottom][i] = number
                    number++
                }
                bottom--
            }
            
            if(left <= right) {
                for(i in bottom downTo top) {
                    answer[i][left] = number
                    number++
                }
                
                left++
            }
            
        }
    
        return answer
    }
}