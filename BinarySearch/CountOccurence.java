package BinarySearch;

public class CountOccurence {

    public static int occur(int[] arr, int x){
       return lowerBound(arr,x+1)-lowerBound(arr,x);
    }

    private static int lowerBound(int[] arr, int x){
        int start =0;
        int n = arr.length;
        int end = n;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<x){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

      public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 3};
        int x =1;

        System.out.println(occur(arr,x));
    }
    
}
