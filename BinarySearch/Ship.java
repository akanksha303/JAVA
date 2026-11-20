package BinarySearch;

public class Ship {
    public static int capacity(int[] nums, int mid){
        int n = nums.length;
        int days =1; 
        int load =0;
        for(int i=0; i<n; i++){
            if(load+nums[i]>mid){
                days ++;
                load =nums[i];
            }
            else{
                load+=nums[i];
            }
        }
        return days;
    }

    public static int ship(int[] nums, int days){
        
        int start =0;
        int end = 0;
        int ans=0;
        for(int num : nums){
            start = Math.max(start, num);
            end +=num;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(capacity(nums, mid)<=days){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        System.out.println(ship(arr, days));
    }
}
