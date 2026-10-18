package BitManipulation;

import java.util.*;

public class PowerSet {

    public static List<List<Integer>> powerSet(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        int totalSubsets = 1 << n;

        for (int i = 0; i < totalSubsets; i++) {

            List<Integer> subset = new ArrayList<>();

            for (int j = 0; j < n; j++) {

                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }

            result.add(subset);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> ans = powerSet(nums);

        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }
    }
}