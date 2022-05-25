import java.util.*;
import java.io.*;

public class boj_20923 {
    static Deque<Integer> doD = new ArrayDeque<>(), suD = new ArrayDeque<>();
    static ArrayList<Integer> suGround = new ArrayList<>(), doGround = new ArrayList<>();
    static int n, m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            doD.add(Integer.parseInt(st.nextToken()));
            suD.add(Integer.parseInt(st.nextToken()));
        }

        int dNum, sNum;
        while (m > 0) {
            if (isEmptyDeque())
                return;

            dNum = doD.pollLast();
            doGround.add(dNum);

            if (isEmptyDeque())
                return;

            if (dNum == 5) {
                doGet();
            } else if (suGround.size() > 0
                    && dNum + suGround.get(suGround.size() - 1) == 5) {
                suGet();
            }

            m--;
            if (m == 0) {
                break;
            }

            sNum = suD.pollLast();
            suGround.add(sNum);
            if (sNum == 5) {
                doGet();
            } else if (doGround.size() > 0
                    && sNum + doGround.get(doGround.size() - 1) == 5) {
                suGet();
            }
            m--;
        }

        if (doD.size() == suD.size()) {
            System.out.println("dosu");
        } else {
            if (doD.size() > suD.size()) {
                System.out.println("do");
            } else {
                System.out.println("su");
            }
        }
    }

    private static boolean isEmptyDeque() {
        if (doD.isEmpty() || suD.isEmpty()) {
            if (doD.size() == 0)
                System.out.println("su");
            else
                System.out.println("do");
            return true;
        }
        return false;
    }

    private static void suGet() {
        while (!doGround.isEmpty()) {
            suD.addFirst(doGround.remove(0));
        }
        while (!suGround.isEmpty()) {
            suD.addFirst(suGround.remove(0));
        }
    }

    private static void doGet() {
        while (!suGround.isEmpty()) {
            doD.addFirst(suGround.remove(0));
        }
        while (!doGround.isEmpty()) {
            doD.addFirst(doGround.remove(0));
        }
    }
}