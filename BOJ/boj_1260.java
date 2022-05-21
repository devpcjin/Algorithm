import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_1260 {
    public static int[][] graph;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new int[n+1][n+1];

        for(int j = 0;j<n+1;j++){
            Arrays.fill(graph[j],0);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        visited = new boolean[n+1];
        dfs(start);
        sb.append("\n");

        visited = new boolean[n+1];
        bfs(start);

        System.out.println(sb);

    }

    public static void dfs(int start){
        visited[start] = true;
        sb.append(start).append(" ");
        if(start == graph.length){
            return;
        }
        for(int i =1; i<visited.length;i++){
            if(graph[start][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> que = new LinkedList<Integer>();

        que.add(start);
        visited[start] = true;
        sb.append(start).append(" ");

        while(!que.isEmpty()){
            int temp = que.peek();
            que.poll();
            for(int i = 0; i< graph.length;i++){
                if(graph[temp][i] == 1 && !visited[i]){
                    que.add(i);
                    visited[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }
}
