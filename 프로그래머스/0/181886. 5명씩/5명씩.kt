class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        answer = names.filterIndexed { i, v -> i%5 == 0 }.toTypedArray()
        return answer
    }
}