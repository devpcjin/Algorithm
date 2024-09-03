class Solution {
    fun solution(binomial: String): Int {
        
        var splitValue = binomial.split(" ")
        
        return when(splitValue[1]) {
            "+" -> splitValue[0].toInt() + splitValue[2].toInt()
            "-" -> splitValue[0].toInt() - splitValue[2].toInt()
            else -> splitValue[0].toInt() * splitValue[2].toInt()
        }
    }
}