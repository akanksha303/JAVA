package Neetcode150.ArraysandHashing;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6};
        int target =7;

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            int comp = target-arr[i];

            if(map.containsKey(comp)){
                System.out.println( new int[]{map.get(comp),i});
            }

            map.put(arr[i],i);

        
        }
        
    }
}
