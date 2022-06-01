import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10211 {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br;
    public static StringTokenizer st;

    public static int t;
    public static int[] array, dp;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            array = new int[n+1];
            dp = new int[n+1];
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                array[j] = Integer.parseInt(st.nextToken());
            }

            sb.append(maximumSum(n)).append("\n");
        }
        System.out.println(sb);
    }

    public static int maximumSum(int n){
        int result = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i ++){
            dp[i] = Math.max(array[i], dp[i-1] + array[i]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }


}
