class Solution {
    fun solution(myString: String): IntArray {
        var answer: IntArray = intArrayOf()
        var count: Int = 0;
        
        myString.forEach {
            if(it == 'x') {
                answer += count;
                count = 0;
            } else {
                count++
            }
        }
        answer += count;
        
        return answer
    }
}