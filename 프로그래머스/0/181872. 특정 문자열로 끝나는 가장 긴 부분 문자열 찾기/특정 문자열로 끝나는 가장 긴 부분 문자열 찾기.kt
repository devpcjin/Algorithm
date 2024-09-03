class Solution {
    fun solution(myString: String, pat: String): String {
        return myString.slice(0..myString.lastIndexOf(pat)+pat.length-1).toString()
    }
}