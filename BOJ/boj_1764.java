import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> hs = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        for(int i=0; i<n; i++)
            hs.add(bf.readLine());

        for(int i=0; i<m; i++) {
            String str = bf.readLine();
            if(hs.contains(str)) 	list.add(str);
        }

        Collections.sort(list);
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i));

        bf.close();
    }

}