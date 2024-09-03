class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        return board.mapIndexed { i, v -> v.mapIndexed { j, x -> if(i+j <= k) x else 0}.sum()}.sum()
    }
}