class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        
        val expandedLines = picture.map { line ->
            line.map { char -> char.toString().repeat(k) }.joinToString("")
        }

        return Array(expandedLines.size * k) { index ->
            expandedLines[index / k]
        }
    }
}