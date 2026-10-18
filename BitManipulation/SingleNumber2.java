package BitManipulation;

public class SingleNumber2 {

    public static int singleNumber(int[] nums) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {

            int count = 0;

            for (int num : nums) {
                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                ans |= (1 << i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 2};

        System.out.println(singleNumber(nums));
    }
}