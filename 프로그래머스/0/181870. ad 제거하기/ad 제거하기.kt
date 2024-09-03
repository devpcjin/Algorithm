class Solution {
    fun solution(strArr: Array<String>): Array<String> = strArr.filterNot { "ad" in it }.toTypedArray()
}