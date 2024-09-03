class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        
        answer = myString.map { 
            if(it.code == 65 || it.code == 97) 'A' 
            else if(it.code < 97 && it.code != 32) (it.code+32).toChar() 
            else it
        }.joinToString("")
        return answer
    }
}