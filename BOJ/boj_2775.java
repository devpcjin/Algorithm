import java.util.Scanner;

public class boj_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[][] APT = new int[15][15];
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }
        for (int j = 1; j < 15; j++) {
            for (int l = 2; l < 15; l++) {
                APT[j][l] = APT[j][l - 1] + APT[j - 1][l];
            }
        }

        int T = sc.nextInt();
        for (int m = 0; m < T; m++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            sb.append(APT[k][n]).append("\n");
        }


        System.out.println(sb);

    }
}
