class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list
        
        val lastTwo = num_list.takeLast(2)
        
        if(lastTwo[1] > lastTwo[0]) answer += lastTwo[1] -lastTwo[0]
        else  answer += lastTwo[1]*2
        return answer
    }
}