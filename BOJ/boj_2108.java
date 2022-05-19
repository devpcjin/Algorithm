import java.util.Arrays;
import java.util.Scanner;

public class boj_2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] value = new int[N];

        int sum = 0;

        for (int i = 0; i < N; i++) {
            value[i] = sc.nextInt();
            sum += value[i];
        }

        Arrays.sort(value);

        int b = value[(N - 1) / 2];
        int c = mode(N, value);
        int d = value[N - 1] - value[0];
        System.out.println(Math.round((double)sum/(double)N));
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    public static int mode(int N, int[] value) {
        int count = 0;
        int max = -1;
        int modeVal = value[0];
        boolean check = false;
        for (int i = 0; i < N-1; i++) {
            if (value[i] == value[i + 1]) {  //1333455566666
                count++;
            } else {
                count = 0;
            }

            if (max < count) {
                max = count;
                modeVal = value[i];
                check = true;
            } else if (max == count && check == true) {
                modeVal = value[i];
                check = false;
            }
        }
        return modeVal;
    }
}

