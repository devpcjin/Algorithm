import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_2504 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String readLine = br.readLine();

        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        int answer = 0;
        int cal = 1;
        for(int i = 0; i < readLine.length(); i++){
            char check = readLine.charAt(i);
            if(check == '('){
                stack.push(check);
                cal *= 2;
            }
            else if(check == '['){
                stack.push(check);
                cal *= 3;
            }
            else{
                if(check == ')'){
                    if(stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    }
                    if(readLine.charAt(i-1) == '(') {
                        answer += cal;
                    }
                    stack.pop();
                    cal /= 2;
                }else if(check==']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        flag = false;
                        break;
                    }
                    if(readLine.charAt(i-1)=='['){
                        answer+=cal;
                    }
                    stack.pop();
                    cal /=3;
                }
                else{
                    flag = false;
                    break;
                }
            }
        }
        if(!flag||!stack.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(answer);
        }

    }
}
