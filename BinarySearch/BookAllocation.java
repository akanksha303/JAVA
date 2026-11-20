package BinarySearch;

public class BookAllocation {
    public static boolean valid(int[] nums, int mid, int k){
        int n = nums.length;
        int curr =0;
        int count =1;
        
        for(int i=0; i<n; i++){
            if(nums[i]+curr<=mid){
                curr +=nums[i];
                
            }
            else{
                count++;
                curr = nums[i];
            }
            if(count> k){
                return false;
            }

        }
        return true;
    }
    public static  int book(int [] nums, int k){
        int n = nums.length;
        if(n<k){
            return -1;
        }

        int start =0;
        int end =0;
        int ans =0;

        for(int num : nums){
            end +=num;
            start = Math.max(start, num);
        }

        while(start<=end){
            int mid = start +(end-start)/2;

            if(valid(nums,mid,k)){
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
        int[] arr = {12, 34, 67, 90};
        int m =2;
        

        System.out.println(book(arr,m));
    }

    
}
