class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        var innerArray: IntArray = intArrayOf()
        
        for(i in 0 until n) {
            for( j in 0 until n) {
                if(i == j) innerArray += 1
                else innerArray += 0
            }
            answer+=innerArray
            innerArray = intArrayOf()
        }
        
        
        return answer
    }
}