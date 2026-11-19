package BinarySearch;

// equal to the index of the minimum element.

public class NumberRotatedtimes {

    public static int Rotation(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<=end){

            int mid = start+(end-start)/2;
            if(arr[mid]>arr[end]){
                start= mid+1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        
        System.out.println(Rotation(arr));
    }
    
}
