package BitManipulation;

public class SingleNumber1 {

    public static int singleNumber(int[] nums) {

        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1};

        System.out.println(singleNumber(nums));
    }
}
