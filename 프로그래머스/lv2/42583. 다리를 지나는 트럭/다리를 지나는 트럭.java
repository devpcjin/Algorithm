import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int totalWeight = 0;
        int passedTruck = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int truck : truck_weights) {
            list.add(truck);
        }
        
        while(passedTruck < truck_weights.length) {
            if(!list.isEmpty()){
                if(queue.isEmpty()) {
                    queue.add(list.get(0));
                    totalWeight += list.get(0);
                    list.remove(0);
                    answer++;
                } else if(queue.size() == bridge_length) {
                    int out = queue.poll();
                    totalWeight -= out;
                    if(out != 0) {
                        passedTruck++;
                    }
                } else {
                    if(totalWeight + list.get(0) <= weight) {
                        queue.add(list.get(0));
                        totalWeight += list.get(0);
                        list.remove(0);
                        answer++;
                    } else {
                        queue.add(0);
                        answer++;
                    }
                }
            } else {
                if(queue.size() == bridge_length) {
                    if(queue.poll() != 0) {
                        passedTruck++;
                    }
                } else {
                    queue.add(0);
                    answer++;
                }
            }
        }
        
        answer++;
        
        return answer;
        
    }
}
