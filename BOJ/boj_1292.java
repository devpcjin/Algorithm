import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1292 {
    public static int[] numSet = new int[10001];

    public static int a;
    public static int b;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer  st = new StringTokenizer(br.readLine());

        a = Integer.parseInt( st.nextToken());
        b = Integer.parseInt( st.nextToken());

        int count  = 1;
        int sum = 0;

        for(int i = 1; i<= 1000; i++){
            for(int j = 0; j < i; j++){
                if(count > 1000){
                    break;
                }
                numSet[count] = i;
                count++;

            }
        }

        for(int i = a; i<=b; i++){
            sum += numSet[i];
        }

        System.out.println(sum);
    }
}
