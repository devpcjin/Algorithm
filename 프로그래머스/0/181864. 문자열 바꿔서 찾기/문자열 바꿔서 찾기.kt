class Solution {
    fun solution(myString: String, pat: String): Int {
        
        val changeString = myString.map { if(it == 'A') 'B' else 'A'}.joinToString("")
        
        return if(pat in changeString) 1 else 0
    }
}