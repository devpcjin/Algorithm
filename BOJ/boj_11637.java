import java.util.Scanner;

public class boj_11637 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int n = sc.nextInt();

            int max = 0;
            int sum = 0;
            int R = 0;
            int R_count = 0;

            for (int j = 0; j < n; j++) {
                int count = sc.nextInt();
                sum += count;
                if(max<count){
                    max = count;
                    R = j+1;
                    R_count = 1;
                } else if(max == count){
                    R_count++;
                }
            }
            if (R_count != 1){
                sb.append("no winner").append('\n');
                continue;
            }
            if (max <= sum/2){
                sb.append("minority winner "+R).append('\n');
            }else{
                sb.append("majority winner "+R).append('\n');
            }

        }
        System.out.println(sb);
    }
}
