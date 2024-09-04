class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        num_list.forEach {
            
            var value = it
            while(value != 1) {
                if(value % 2 == 0) {
                    value /= 2
                }else {
                    value = (value-1)/2
                }
                answer++
            }
        }
        return answer
    }
}