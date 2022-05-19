import java.util.Scanner;

public class boj_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int min = 0;

        char[][] chess = new char[N][M];

        //입력 받은 값으로 체스판 만들기
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                chess[i][j] = str.charAt(j);
            }
        }

        int N_max = N - 7;
        int M_max = M - 7;

        for (int i = 0; i < N_max; i++) {
            for (int j = 0; j < M_max; j++) {
                int N_8 = i + 8;
                int M_8 = j + 8;
                int count = 0;

                char WB = chess[i][j];

                for (int k = i; k < N_8; k++) {
                    for (int l = j; l < M_8; l++) {
                        if (chess[k][l] != WB) {
                            count++;
                        }

                        if (WB == 'W') {
                            WB = 'B';
                        } else if (WB == 'B') {
                            WB = 'W';
                        }
                    }
                    if (WB == 'W') {
                        WB = 'B';
                    } else if (WB == 'B') {
                        WB = 'W';
                    }
                }

                if(count > 64-count){
                    count = 64-count;
                }

                if (i == 0 && j == 0) {
                    min = count;
                }

                if (min > count) {
                    min = count;
                }
            }
        }
        System.out.println(min);

    }

}
