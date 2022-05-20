import java.util.Scanner;

public class boj_2947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] woods = new int[5];
        for (int i=0;i<5;i++){
            woods[i] = sc.nextInt();
        }

        for(int j = 0; j<5;j++){
            for(int k =0; k<4;k++){
                if(woods[k]>woods[k+1]){
                    int temp = woods[k];
                    woods[k] = woods[k+1];
                    woods[k+1] = temp;
                    for(int wood : woods){
                        System.out.print(wood+" ");
                    }
                    System.out.println();
                }
            }
        }

    }
}
