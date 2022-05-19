public class boj_4637 {
    public static void main(String[] args) {
        boolean[] isSelf = new boolean[10001];

        for(int i=0; i < isSelf.length; i++){
            isSelf[i] = true;
        }

        for(int j = 1; j <= 10000; j++){
            int n = d(j);

            if(n <= 10000) {
                isSelf[n] = false;
            }

        }

        for(int k = 1; k < isSelf.length; k++){
            if(isSelf[k]){
                System.out.println(k);
            }
        }

    }
    public static int d(int num){
        int result = num;

        while(num > 0){
            result += (num%10);
            num = num/10;
        }

        return result;
    }
}
