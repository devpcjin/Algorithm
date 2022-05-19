import java.util.Scanner;

public class boj_11721 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        sc.close();

        for(int i = 0; i <= text.length()-1;i++){
            System.out.print(text.charAt(i));
            if (i%10 == 9){
                System.out.println();
            }
        }

    }
}
