class Solution { 
    public String solution(int age) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        if((age/1000) != 0){
            sb.append((char)(97+(age/1000)));
            age %= 1000;
            sb.append((char)(97+(age/100)));
            age %= 100;
            sb.append((char)(97+(age/10)));
            age %= 10;
            sb.append((char)(97+age));
        }else{
            if((age/100) != 0){
                sb.append((char)(97+(age/100)));
                age %= 100;
                sb.append((char)(97+(age/10)));
                age %= 10;
                sb.append((char)(97+age));
            } else{
                if((age/10) != 0){
                    sb.append((char)(97+(age/10)));
                    age %= 10;
                    sb.append((char)(97+age));
                }else{
                    sb.append((char)(97+age));
                }
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
