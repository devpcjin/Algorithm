class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        var map = HashMap<String, Int>()
        for(i in 0..name.size-1) {
            map.put(name[i], yearning[i])
        }
        for(i in 0..photo.size-1) {
            var sum: Int = 0;
            for(j in 0..photo[i].size-1) {
                if(map.containsKey(photo[i][j])) {
                    sum += map[photo[i][j]]!!
                }
            }
            answer = answer.plus(sum)
        }
        return answer
    }
}