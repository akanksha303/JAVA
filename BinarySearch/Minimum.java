package BinarySearch;
public class Minimum {
    public static int min(int[] arr){
        int n = arr.length;
        int start =0;
        int end = n-1;
        
        while(start<end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]>arr[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};

        System.out.println(min(arr));
    }
    
}
