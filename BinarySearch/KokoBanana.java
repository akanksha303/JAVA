package BinarySearch;

public class KokoBanana {
    public static int banana(int[] nums, int n, int h){

        int start =1;
        int end =0;
        
        for(int num : nums){
            end = Math.max(end, num);
        }

        int ans = end;

        while(start<=end){
            int mid = start +(end-start)/2;
            long sum =0;

            for(int num : nums){
                sum +=(num-1)/mid+1;
            }

            if(sum<=h){
                ans = mid;
                end = mid-1;

            }
            else{
                start  = mid+1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int n = 4;
        int h =8;
        
        System.out.println(banana(arr, n, h));
        
    }
    
}
