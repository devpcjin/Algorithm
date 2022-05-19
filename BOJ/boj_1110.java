import java.util.Scanner;

public class boj_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = N;
        int count = 0;

        while (true){
            N = ((N % 10) * 10)  // 새로운 십의 자리
                    + (((N / 10) + (N % 10)) % 10); // 새로운 일의 자리
            count++;
            if( result == N ){
                break;
            }
        }
        System.out.println(count);
    }
}
