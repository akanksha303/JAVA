package sorting;

import java.util.Arrays;

public class Selectionsort {
   public static void main(String[] args) {
     
    int[] arr =  {64,65,45,87,98,101};

    int n = arr.length;

    for(int i=0; i<n; i++){
        int mid =i;

        for(int j =i+1; j<n; j++){
            if(arr[j]<arr[mid]){
                mid = j;
            }
        }

        int temp = arr[i];
        arr[i]= arr[mid];
        arr[mid] = temp;

    }

    System.out.println(Arrays.toString(arr));
   }
    
}
