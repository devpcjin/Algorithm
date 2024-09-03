class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        var tempString = ""
        
        for(i in my_string) {
            print(i)
            if(i.code != 32)  tempString += i
            else {
                if(tempString !== "") {
                    answer += tempString
                    tempString = ""
                }
            }
        }
        if(tempString != "") answer += tempString
        return answer
    }
}