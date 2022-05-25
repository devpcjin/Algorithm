import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2438 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

}
