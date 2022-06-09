import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2702 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static int t;
    public static int gcd = 0;
    public static int lcm = 0;

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int j = 1;

            while (true) {
                if (a % j == 0 && b % j == 0) {
                    lcm = j;
                }
                if (j % a == 0 && j % b == 0){
                    gcd = j;
                    break;

                }
                j++;
            }
            sb.append(gcd).append(" ");
            sb.append(lcm).append("\n");
        }
        System.out.println(sb);
    }
}
