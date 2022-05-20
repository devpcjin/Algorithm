import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Stack;

public class boj_9012 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String vps = br.readLine();

            Stack<Character> stack = new Stack<Character>();

            for(int j = 0; j<vps.length();j++){
                if (vps.charAt(j) == '('){
                    stack.push(vps.charAt(j));
                }else{
                    if(stack.empty()){
                        stack.push(vps.charAt(j));
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
            if(stack.empty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}
