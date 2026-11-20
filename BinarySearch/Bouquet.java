package BinarySearch;

public class Bouquet {

    public static int check( int[] nums, int mid, int k){
        int count=0;
        int n = nums.length;
        int book = 0;
        for(int i=0; i<n; i++){
            if(nums[i]<=mid){
                count++;
            }
            else{
                book = count/k;
                count =0;
            }
        }
        book += count /k;

        return book;


    }

    public static int bok(int[] nums, int k, int h){
        int n  = nums.length;

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        int ans = end;

        for(int num : nums){
            start = Math.min(num, start);
            end = Math.max(num, end);
        }

        if(k*h>n){
            return -1;
        }

        while(start<=end){

            int mid = start+(end-start)/2;
            if(check(nums, mid, k)>=h){
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
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int m =2;
        int k =3;

        System.out.println(bok(arr,m,k));
    }
    
}
