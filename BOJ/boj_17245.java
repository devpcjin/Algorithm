import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_17245 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int n;
    public static long[][] computer;

    public static long totalCom;
    public static long active;

    public static long left;
    public static long right;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        computer = new long[n][n];
        totalCom = 0;
        right = 0;
        left = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                computer[i][j] = Long.parseLong(st.nextToken());
                totalCom += computer[i][j];
                if (computer[i][j] > right) {
                    right = computer[i][j];
                }
            }
        }

        while (left+1<right) {
            long mid = (right+left)/2;
            active = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    active += Math.min(computer[i][j], mid);
                }
            }
            if(((double)active/totalCom)>=0.5){
                right = mid;
            }else{
                left = mid;
            }
        }
        System.out.println(right);
    }
}
