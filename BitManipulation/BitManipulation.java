package BitManipulation;

public class BitManipulation{

    // 1. Check if the i-th bit is Set or Not
    public static boolean isIthBitSet(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    // 2. Check if a Number is Odd or Not
    public static boolean isOdd(int n) {
        return (n & 1) != 0;
    }

    // 3. Check if a Number is Power of 2 or Not
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // 4. Count the Number of Set Bits
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    // 5. Set the Rightmost Unset Bit
    public static int setRightmostUnsetBit(int n) {
        return n | (n + 1);
    }

    // 6. Swap Two Numbers (using XOR)
    // Returns an array where index 0 is 'a' and index 1 is 'b' after swapping
    public static int[] swapNumbers(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[] { a, b };
    }

    // 7. Minimum Bit Flips to Convert Number
    public static int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;
        while (xor > 0) {
            count += (xor & 1);
            xor >>= 1;
        }
        return count;
    }

    // Main function to test all the operations
    public static void main(String[] args) {
        System.out.println("=== Bit Manipulation Tests ===\n");

        // Test 1: Check if i-th bit is set
        int n1 = 13; // Binary: 1101
        int i = 2;
        System.out.println("1. Is bit " + i + " set in " + n1 + "? " + isIthBitSet(n1, i)); // true (since 3rd bit is 1)

        // Test 2: Check if odd or even
        int n2 = 9;
        System.out.println("2. Is " + n2 + " odd? " + isOdd(n2)); // true

        // Test 3: Check power of 2
        int n3 = 16;
        System.out.println("3. Is " + n3 + " a power of 2? " + isPowerOfTwo(n3)); // true

        // Test 4: Count set bits
        int n4 = 13; // Binary: 1101
        System.out.println("4. Number of set bits in " + n4 + ": " + countSetBits(n4)); // 3

        // Test 5: Set the rightmost unset bit
        int n5 = 10; // Binary: 1010 -> rightmost unset bit becomes set -> 1011 (11)
        System.out.println("5. Set rightmost unset bit of " + n5 + ": " + setRightmostUnsetBit(n5)); // 11

        // Test 6: Swap two numbers
        int a = 5, b = 9;
        System.out.println("6. Before swap: a = " + a + ", b = " + b);
        int[] swapped = swapNumbers(a, b);
        System.out.println("   After swap: a = " + swapped[0] + ", b = " + swapped[1]);

        // Test 7: Minimum bit flips
        int start = 10, goal = 7;
        System.out.println("7. Min bit flips to convert " + start + " to " + goal + ": " + minBitFlips(start, goal)); // 3
    }
}
