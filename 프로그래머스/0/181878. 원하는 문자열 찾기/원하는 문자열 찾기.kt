class Solution {
    fun solution(myString: String, pat: String): Int {
        
        return if(pat.toLowerCase() in myString.toLowerCase()) 1 else 0
    }
}