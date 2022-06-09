import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj_2535 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static int score[][];

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        score = new int[n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            score[i][0] = Integer.parseInt(st.nextToken());
            score[i][1] = Integer.parseInt(st.nextToken());
            score[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });
        int count = 0;
        int country = 0;

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                sb.append(score[i][0]).append(" ").append(score[i][1]).append("\n");
            }else if(score[0][0] == score[1][0] && score[1][0] == score[i][0]){
                continue;
            } else{
                sb.append(score[i][0]).append(" ").append(score[i][1]).append("\n");
                break;
            }

        }
        System.out.println(sb);
    }
}
