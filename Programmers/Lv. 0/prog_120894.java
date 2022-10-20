class Solution {
    public long solution(String numbers) {
        long answer = 0;
        int i = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(i <= numbers.length()-2) {
            if(numbers.charAt(i) == 'z') {
                i += 4;
                sb.append('0');
            } else if(numbers.charAt(i) == 'o') {
                i += 3;
                sb.append('1');
                
            } else if(numbers.charAt(i) == 't') {
                if(numbers.charAt(i+1) == 'w') {
                    i += 3;
                    sb.append('2');
                } else {
                    i += 5;
                    sb.append('3');
                }
                
            } else if(numbers.charAt(i) == 'f') {
                if(numbers.charAt(i+1) == 'o') {
                    i += 4;
                    sb.append('4');
                } else {
                    i += 4;
                    sb.append('5');
                }
                
            } else if(numbers.charAt(i) == 's') {
                if(numbers.charAt(i+1) == 'i') {
                    i += 3;
                    sb.append('6');
                } else {
                    i += 5;
                    sb.append('7');
                }
                
            } else if(numbers.charAt(i) == 'e') {
                i += 5;
                sb.append('8');     
            } else if(numbers.charAt(i) == 'n') {
                i += 4;
                sb.append('9');
            }
        }
        
        String s = sb.toString();
        
        answer = Long.parseLong(s);
        
        
        return answer;
    }
}
