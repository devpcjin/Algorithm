import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for(int i = 0; i < operations.length; i++){
            String[] commend = operations[i].split(" ");
            String code = commend[0];
            int num = Integer.parseInt(commend[1]);
            if(code.equals("I")) {
                que.offer(num);
            }else if(!que.isEmpty()){
                Deque<Integer> deque = new LinkedList<>(que);
                if(num == -1) {
                    deque.removeFirst();
                }else {
                    deque.removeLast();
                }
                que = new PriorityQueue<>(deque);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>(que);
        Collections.sort(result);
        
        if(result.size() == 1) {
            int value = result.get(0);
            answer[0] = value;
            answer[1] = value;
        } else if(result.size() > 1){
            answer[0] = result.get(result.size()-1);
            answer[1] = result.get(0);
        }
        return answer;
    }
}