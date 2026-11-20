package BinarySearch;

public class PaintersPartitionModulo {

    public static int countPainters(int[] C, long maxBoardLength) {
        int painters = 1;
        long currentSum = 0;

        for (int board : C) {
            if (currentSum + board > maxBoardLength) {
                painters++;
                currentSum = board;
            } else {
                currentSum += board;
            }
        }
        return painters;
    }

    public static int paint(int A, int B, int[] C) {
        long start = 0;
        long end = 0;

        for (int board : C) {
            start = Math.max(start, board);
            end += board;
        }

        long ans = end;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (countPainters(C, mid) <= A) {
                ans = mid;       // Valid max board length, save it
                end = mid - 1;   // Look left for an even smaller length
            } else {
                start = mid + 1; // Too few units per painter, look right
            }
        }

        // Multiply by time per unit (B) and apply modulo at the very end
        return (int) ((ans * B) % 10000003);
    }

    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        int[] C = {1, 10};

        System.out.println(paint(A, B, C)); // Outputs 50 (10 units * 5 time = 50)
    }
}