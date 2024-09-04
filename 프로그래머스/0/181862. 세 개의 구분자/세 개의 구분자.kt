class Solution {
    fun solution(myStr: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        var word: String = ""
        
        myStr.forEach {
            if(it == 'a' || it == 'b' || it == 'c') {
                if(word.isNotEmpty()) {
                    answer += word
                    word = ""
                }
            } else {
                word += it
            }
        }
        if(word.isNotEmpty()) answer += word
        
        return if(answer.isNotEmpty()) answer else arrayOf<String>("EMPTY")
    }
}