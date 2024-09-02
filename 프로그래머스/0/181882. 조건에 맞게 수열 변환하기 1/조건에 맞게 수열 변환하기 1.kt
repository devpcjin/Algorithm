class Solution {
    fun solution(arr: IntArray): ArrayList<Int> {
        var answer: ArrayList<Int> = arrayListOf()
        
        for(i in arr) {
            if(i >= 50 && i%2 == 0) {
                answer.add(i/2)
            } else if (i < 50 && i%2 != 0) {
                answer.add(i*2)
            } else {
                answer.add(i)
            }
        }
        return answer
    }
}