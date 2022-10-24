class Solution {
    public int solution(int a, int b) {
        int denominator = b / gcd(a, b);

        while (denominator != 1) {
            if (denominator % 2 == 0) {
                denominator /= 2;
            } else if (denominator % 5 == 0) {
                denominator /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
