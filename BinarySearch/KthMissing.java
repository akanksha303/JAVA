package BinarySearch;

public class KthMissing {
    public static int Miss(int[] nums, int k){
        int start =0;
        int n = nums.length;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            int missing = nums[mid]-(mid+1);
            if(missing<k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start+k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 9};
        int k =3;

        System.out.println(Miss(nums, k));
    }
    
}
