package BinarySearch;
import java.util.*;

public class AggresiveCows {
    public static boolean canplace(int[] nums, int mid, int k){
        int cowsplaced =1;
        int n = nums.length;
        int start = nums[0];
        for(int i =0; i<n; i++){
            if(nums[i]-start >=mid){
                cowsplaced++;
                start = nums[i];
            }
            if(cowsplaced==k){
                return true;
            }
        }
        return false;
    }
    public static int agg(int[] nums, int k){
        int n = nums.length;
        Arrays.sort(nums);
        int start = 1;
        int end = nums[n-1]-nums[0];
        int ans =0;
        
        while(start<=end){
            int mid = start+(end-start)/2;

            if(canplace(nums, mid, k)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr  = {0, 3, 4, 7, 10, 9};
        int k =4;

        System.out.println(agg(arr, k));
    }

    
}
