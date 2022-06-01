import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int countTwo = 0;
        int countFive = 0;

        int count = 0;

        for(int i = 1; i <=n; i++){
            int check = i;

            while (check % 2 == 0){
                countTwo++;
                check /= 2;
            }

            while (check%5 == 0){
                countFive++;
                check/= 5;
            }
        }

        if(countTwo > countFive){
            count = countFive;
        }else {
            count = countTwo;
        }

        System.out.println(count);

    }

}
