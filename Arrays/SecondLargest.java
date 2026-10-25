import java.util.*;

class SecondLargest{
    public static int second(int[] arr){
        int largest =Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>largest){
                SecondLargest = largest;
                largest = num;
            }
        }
        return SecondLargest;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
         }

         System.out.println(second(arr));
         sc.close();
        }

}