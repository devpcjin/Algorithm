class Solution {
    fun solution(n_str: String): String {
        var answer: String = ""
        var idx: Int = 0
        
        for((i, v) in n_str.withIndex()) {
            if(v != '0') {
                idx = i
                break;
            }
        }
        
        answer = n_str.slice(idx until n_str.length)
        return answer
    }
}