import java.util.Scanner;

public class boj_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int five = N%5;

        if(N == 4 || N ==7){
            System.out.println(-1);
        }
        else if ( five == 0){
            System.out.println(N/5);
        } else if (five == 1 | five == 3) {
            System.out.println((N/5)+1);
        } else if (five == 2 | five == 4){
            System.out.println((N/5)+2);
        }
    }
}
