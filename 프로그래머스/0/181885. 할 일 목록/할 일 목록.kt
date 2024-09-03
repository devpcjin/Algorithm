class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String>
    = todo_list.mapIndexed{ i, v -> if(!finished[i]) v else "" }.filter{ it != ""}.toTypedArray()
}