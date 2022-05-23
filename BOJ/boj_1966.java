import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj_1966 {
    public static BufferedReader br;
    public static StringBuilder sb;
    public static StringTokenizer st;
    public static LinkedList<int[]> linkedList;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            linkedList = new LinkedList<>();


            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++)
                linkedList.offer(new int[] {i, Integer.parseInt(st.nextToken())});


            int count = 0;
            while (!linkedList.isEmpty()) {
                int[] first = linkedList.poll();
                boolean end = true;


                for(int i = 0; i < linkedList.size(); i++) {

                    if(first[1] < linkedList.get(i)[1]) {
                        linkedList.offer(first);


                        for(int j = 0; j < i; j++)
                            linkedList.offer(linkedList.poll());

                        end = false;

                        break;
                    }
                }

                if(end) {
                    count++;
                    if(first[0] == m) break;
                }
            }

            // M번째 문서의 인쇄 차례 출력
            sb.append(count).append('\n');
        }

        // 출력
        System.out.println(sb);
    }

}