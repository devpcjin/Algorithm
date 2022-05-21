import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj_1620 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String[] pokemonName = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String pokemon = br.readLine();
            map.put(pokemon, i);
            pokemonName[i] = pokemon;
        }

        while (M-- > 0) {
            String quiz = br.readLine();
            if (isStringDouble(quiz)) {
                int number = Integer.parseInt(quiz);
                sb.append(pokemonName[number]).append("\n");
            } else {
                sb.append(map.get(quiz)).append("\n");
            }

        }
        System.out.println(sb);

    }

    public static boolean isStringDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
