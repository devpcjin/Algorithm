class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        
        var mode: Int = 0;
        
        for((idx, s) in code.withIndex()) {
            when(mode) {
                0 -> {
                    if(s == '1') mode = 1
                    else if(idx % 2 == 0) answer += s
                }
                1-> {
                    if(s == '1') mode = 0
                    else if(idx % 2 == 1) answer += s
                }
            }
        }
        
        
        return if(answer.isEmpty()) "EMPTY" else return answer
    }
}