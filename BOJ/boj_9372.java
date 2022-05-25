import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_9372 {
    static int n, m, result;
    static boolean visited[];
    static int check[][];

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            result = 0;

            check = new int[n +1][n +1];
            visited = new boolean[n +1];

            for(int j = 0; j< m; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                check[a][b] = 1;
                check[b][a] = 1;
            }
            bfs();
            System.out.println(result-1);
        }
    }
    private static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        visited[1] = true;
        while(!queue.isEmpty()) {
            result++;
            int val = queue.poll();
            for(int i = 1; i<= n; i++) {
                if(check[val][i]!=0 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
