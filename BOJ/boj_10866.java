import java.util.Scanner;

public class boj_10866 {

    public static int[] deque;
    public static int size = 0;

    public static int front = 10000;
    public static int back = 10000;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        deque = new int[20001];

        for (int i = 0; i < T; i++) {

            String str = sc.next();

            switch (str) {

                case "push_front":
                    push_front(sc.nextInt());
                    break;

                case "push_back":
                    push_back(sc.nextInt());
                    break;

                case "pop_front":
                    sb.append(pop_front()).append('\n');
                    break;

                case "pop_back":
                    sb.append(pop_back()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "front":
                    sb.append(front()).append('\n');
                    break;

                case "back":
                    sb.append(back()).append('\n');
                    break;

            }

        }
        System.out.println(sb);
    }

    public static void push_front(int item) {
        deque[front] = item;
        front--;
        size++;
    }

    public static void push_back(int item) {
        back++;
        size++;
        deque[back] = item;
    }

    public static int pop_front() {
        if (size == 0) {
            return -1;
        } else {
            int result = deque[front+1];
            front++;
            size--;
            return result;
        }
    }

    public static int pop_back() {
        if (size == 0) {
            return -1;
        } else {
            int result = deque[back];
            back--;
            size--;
            return result;
        }
    }

    public static int size()
    {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (size == 0) {
            return -1;
        } else {
            int result = deque[front+1];
            return result;
        }
    }

    public static int back() {
        if (size == 0) {
            return -1;
        } else {
            int result = deque[back];
            return result;
        }
    }

}


