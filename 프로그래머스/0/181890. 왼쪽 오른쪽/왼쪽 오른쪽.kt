class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        str_list.forEachIndexed { i, v -> 
            if(v == "l" && i == 0) return answer
            else if(v == "l") {
                return str_list.slice(0 until i).toTypedArray()
            }
            else if(v == "r") {
                return str_list.slice(i+1 until str_list.size).toTypedArray()
            }
        }
        
        return answer
    }
}