import java.time.LocalDate

class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        
        val realDate1 = LocalDate.of(date1[0], date1[1], date1[2])
        val realDate2 = LocalDate.of(date2[0], date2[1], date2[2])
        
        return if (realDate1 < realDate2) 1 else 0

    }
}