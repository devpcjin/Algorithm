class Solution {
    fun solution(strArr: Array<String>): Array<String> = strArr.filter { !("ad" in it)}.toTypedArray()
}