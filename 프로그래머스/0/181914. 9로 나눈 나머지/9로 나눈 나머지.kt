class Solution {
    fun solution(number: String): Int = number.map { it.toString().toInt() }.sum() % 9
}