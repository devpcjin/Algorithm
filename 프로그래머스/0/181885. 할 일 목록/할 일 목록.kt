class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String>
    = todo_list.filterIndexed{ i, _ -> !finished[i] }.toTypedArray()
}