package BinarySearch;
import java.util.*;

public class FloorCeil {

    public static int[] floor(int[] arr , int x){
        int n = arr.length;
        int start =0;
        int end = n-1;
        int ceil =0;
        int floor =0;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==x){
                return new int[]{x,x};
            }

            else if(arr[mid]<x){
                floor = arr[mid];
                start = mid+1;
            }
            else{
                ceil = arr[mid];
                end = mid-1;

            }
            
        }
        return new int[]{floor, ceil};
       
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x =5;
        int[] res = floor(arr,x);

        System.out.println(Arrays.toString(res));
    }


    
}
