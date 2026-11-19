package BinarySearch;

public class SearchRotated {
    
    //46. Search in rotated sorted array-I
    public static int search(int[] arr, int x){
        int n = arr.length;
        int start =0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==x){
                return(mid);
            }
            
            if(arr[start]<=arr[mid]){
                if(arr[start]<=x && x<=arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid]<x && x<=arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }

        }
        return -1;

    }

    //46. Search in rotated sorted array-II
     public static int search2(int[] arr, int x){
        int n = arr.length;
        int start =0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==x){
                return(mid);
            }

            //only handles duplicate both the edn
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
                continue;
            }
            
            if(arr[start]<=arr[mid]){
                if(arr[start]<=x && x<=arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid]<x && x<=arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }

        }
        return -1;

    }


    public static void main(String[] args) {
        
        int [] arr ={4, 5, 6, 7, 0, 1, 2};
        int x=0;

        int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k =3;
        
        System.out.println(search(arr,x));
        System.out.println(search2(nums, k));
        
        
    }
    
}
