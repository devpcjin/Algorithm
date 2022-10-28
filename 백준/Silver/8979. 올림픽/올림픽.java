import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[][] medal;

    public static int n;
    public static int k;
    public static int rank;


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        medal = new int[n+1][4];
        rank = 1;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            medal[index][0] = Integer.parseInt(st.nextToken());
            medal[index][1] = Integer.parseInt(st.nextToken());
            medal[index][2] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            if (medal[i][0] > medal[k][0]) {
                rank++;
            } else if (medal[i][0] == medal[k][0] && medal[i][1] > medal[k][1]) {
                rank++;
            } else if (medal[i][0] == medal[k][0] && medal[i][1] == medal[k][1] && medal[i][2] > medal[k][2]) {
                rank++;
            }
        }

        System.out.println(rank);

    }
}