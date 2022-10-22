class Solution {
    public String[] solution(String my_str, int n) {
        
        int arrayLength = 0;
        
        if((my_str.length() % n) == 0) {
            arrayLength = my_str.length() / n;
        } else {
            arrayLength = (my_str.length() / n) + 1;
        }
        
        String[] answer = new String[arrayLength];
        
        int index = 0;
        
        for(int i = 0; i < arrayLength; i++){
            if(index+n < my_str.length()){
                answer[i] = my_str.substring(index, index + n);
                index += n;
            }else{
                answer[i] = my_str.substring(index);
            }
        }
        
        
        
        return answer;
    }
}
