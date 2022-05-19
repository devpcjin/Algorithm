import java.util.Arrays;
import java.util.Scanner;

public class boj_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dwarves = new int[9];
        int sum = 0;
        int gap = 0;
        int fake1 = 0;
        int fake2 = 0;

        for(int i = 0; i<9;i++){
            dwarves[i] = sc.nextInt();
            sum += dwarves[i];
        }
        Arrays.sort(dwarves);

        gap = sum-100;

        for(int j = 0; j < dwarves.length-1; j++) {
            for (int k = 0; k < dwarves.length; k++) {
                if (j == k) continue;
                if (dwarves[j] + dwarves[k] == gap) {
                    fake1 = j;
                    fake2 = k;
                    break;
                }
            }
        }

        for(int l = 0; l < dwarves.length; l++){
            if(l == fake1 || l == fake2){
                continue;
            }
            System.out.println(dwarves[l]);
        }

    }
}
