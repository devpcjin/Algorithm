import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_16958 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static int n, t, m;
    public static int s, x, y;

    public static int[][] city;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        city = new int[n+1][3];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            city[i][0] = Integer.parseInt(st.nextToken());
            city[i][1] = Integer.parseInt(st.nextToken());
            city[i][2] = Integer.parseInt(st.nextToken());
        }

        m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int distance = 0;

            if (city[a][0] == 1 && city[b][0] == 1) {
                distance = getDistance(a, b);
            } else if (city[a][0] == 1) {
                int telB = getNearestTelpo(b);
                distance = Math.min(telB+t, getDistance(a,b));
            } else if (city[b][0] == 1) {
                int telA = getNearestTelpo(a);
                distance = Math.min(telA+t, getDistance(a,b));
            } else {
                int telA = getNearestTelpo(a);
                int telB = getNearestTelpo(b);
                distance = Math.min(telA+telB+t, getDistance(a,b));
            }

            sb.append(distance).append("\n");
        }
        System.out.println(sb);
    }

    private static int getNearestTelpo (int point){
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; ++i) {
            if (city[i][0] == 0) continue;
            int dist = getDistance(point, i);
            min = min > dist ? dist : min;
        }

        return min;
    }

    private static int getDistance ( int a, int b){
        int dist = Math.abs(city[a][1] - city[b][1]) + Math.abs(city[a][2] - city[b][2]);
        if (city[a][0] == 1 && city[b][0] == 1) dist = dist > t ? t : dist;
        return dist;
    }
}
