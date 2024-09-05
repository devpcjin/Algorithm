class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        
        return code.filterIndexed { i, _ -> i%q == r }
    }
}