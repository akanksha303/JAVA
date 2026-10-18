package BitManipulation;

public class XORRange {

    public static int xorTillN(int n) {

        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;

        return 0;
    }

    public static int xorRange(int L, int R) {
        return xorTillN(R) ^ xorTillN(L - 1);
    }

    public static void main(String[] args) {

        int L = 3;
        int R = 6;

        System.out.println(xorRange(L, R));
    }
}
