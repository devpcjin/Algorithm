import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_10815 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder();

    private static int[] have;
    private static int[] answer;

    private static int n, m;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        have = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            have[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(have);

        m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {

            int guess = Integer.parseInt(st.nextToken());
            if (binarySearch(guess)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }

        }

        System.out.println(sb);
        br.close();
    }

    private static boolean binarySearch(int num) {
        int leftIndex = 0;
        int rightIndex = n - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = have[midIndex];

            if (num < mid) {
                rightIndex = midIndex - 1;
            } else if (num > mid) {
                leftIndex = midIndex + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}

