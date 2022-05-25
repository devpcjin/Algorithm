import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2752 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static StringBuilder sb = new StringBuilder();

    public static int[] nums = new int[3];

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<3;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        for(int num : nums){
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }

}
