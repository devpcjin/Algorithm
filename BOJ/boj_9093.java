import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_9093 {
    private static int t;

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String line = br.readLine()+"\n";
            Stack stack = new Stack();

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == ' '||line.charAt(j)=='\n') {
                    while (!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(line.charAt(j));
                } else {
                    stack.add(line.charAt(j));
                }
            }
        }
        System.out.println(sb);
    }
}
