import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_13019 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str1 = br.readLine();
        String str2 = br.readLine();

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        int count = 0;

        for(int i = str1.length()-1; i >= 0; i--){
            if(str1.charAt(i)==str2.charAt(str1.length()-1-count)){
                count++;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.deepEquals(arr1, arr2)){
            System.out.println(str1.length()-count);
        }else{
            System.out.println(-1);
        }
    }
}
