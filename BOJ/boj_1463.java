import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1463 {
    public static int x;
    public static Integer[] number;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());

        number = new Integer[x + 1];

        number[0] = number[1] = 0;

        int count = makeOne(x);

        System.out.println(count);

    }

    public static int makeOne(int num) {
        if (number[num] == null) {
            if (num % 6 == 0) {
                number[num] = Math.min(makeOne(num - 1), Math.min(makeOne(num / 3), makeOne(num / 2))) + 1;
            } else if (num % 3 == 0) {
                number[num] = Math.min(makeOne(num / 3), makeOne(num - 1)) + 1;
            } else if (num % 2 == 0) {
                number[num] = Math.min(makeOne(num / 2), makeOne(num - 1)) + 1;
            } else {
                number[num] = makeOne(num - 1) + 1;
            }
        }
        return number[num];
    }
}
