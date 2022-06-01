import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class boj_15988 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static Scanner sc = new Scanner(System.in);
    public static int t;

    public static long[] dp = new long[1000001];


    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            int n = Integer.parseInt(br.readLine());

            for (int j = 4; j <= n; j++) {
                dp[j] = (dp[j-1] + dp[j-2] + dp[j-3]) % 1_000_000_009;
            }
            sb.append(dp[n]).append("\n");

        }

        System.out.println(sb);
    }


}
