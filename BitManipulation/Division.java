package BitManipulation;

public class Division {

    public static int divide(int dividend, int divisor) {

        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;

        for (int i = 31; i >= 0; i--) {

            if ((dvd >> i) >= dvs) {

                quotient += (1 << i);
                dvd -= (dvs << i);
            }
        }

        // Determine sign
        if ((dividend < 0) ^ (divisor < 0)) {
            quotient = -quotient;
        }

        return quotient;
    }

    public static void main(String[] args) {

        int dividend = 20;
        int divisor = 3;

        System.out.println(divide(dividend, divisor));
    }
}
