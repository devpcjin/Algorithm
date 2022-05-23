import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_10773 {
    public static int k;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        k = Integer.parseInt(br.readLine());
        for(int i = 0; i < k; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                stack.pop();
            }else{
                stack.push(num);
            }
        }

        int result = 0;

        while(!stack.isEmpty()){
            result += stack.peek();
            stack.pop();
        }

        System.out.println(result);

    }
}
