import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class boj_2480 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());

        int award = 0;

        if(dice1 == dice2 && dice2==dice3){
            award = 10000+(dice1*1000);
        }else if(dice1 == dice2 || dice1 == dice3) {
            award = 1000 + (dice1 * 100);
        }else if (dice2 == dice3) {
            award = 1000+(dice2*100);

        }else {
            award = (Math.max(dice1, Math.max(dice2,dice3))*100);
        }
        System.out.println(award);
    }
}
