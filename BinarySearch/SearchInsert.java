package BinarySearch;

public class SearchInsert {

    public int sorted(int[] arr, int x){
        int n = arr.length;
        int start=0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
            else if(arr[mid]>x){
                end = mid-1;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int x= 5;

        SearchInsert ob = new SearchInsert();
        System.out.println(ob.sorted(arr, x));
    }
    
}
