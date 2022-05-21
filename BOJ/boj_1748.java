import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1748 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int n;
    public static int length;
    public static int count;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        int numLen = 10;
        int count = 1;
        for(int i = 1; i <= n; i++){
            if(i%numLen == 0){
                count++;
                numLen *= 10;
            }
            length += count;
        }

        System.out.println(length);
    }
}
