import java.io.*;

public class boj_2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=count; i++){
            for(int j=1; j<=i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=count-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
