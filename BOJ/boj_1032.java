import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1032 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static int n;
    private static boolean isSame;
    private static String[] text;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        text = new String[n];
        for(int i = 0; i < n; i++){
            text[i] = br.readLine();
        }

        for(int i =0; i < text[0].length(); i++){
            char c = text[0].charAt(i);
            if(n == 1){
                sb.append(text[0]);
                break;
            }
            for(int j = 1; j < n; j++){
                isSame = true;
                if(c!=text[j].charAt(i)){
                    isSame = false;
                    break;
                }
            }
            if(isSame == true){
                sb.append(c);
            }else {
                sb.append("?");
            }

        }
        System.out.println(sb);
    }
}
