
public class LeftRotateByk {
    public static void Brute(int[] arr, int k){
        int n =arr.length;
        k = k%n;

        int[] temp= new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr[(i+k)%n];
        }
        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }
        System.out.println(arr);
    }
    public static void Reverse(int[] arr , int start , int end){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
             start++;
             end--;
        }
    }
    public int[] optimal(int[] arr, int k){
        //Reverse the k element
        //Reverse the rest element
        //Reverse the whole array

        int n = arr.length;
        Reverse(arr,0,k);
        Reverse(arr,k,n);
        Reverse(arr,0,n);

        return (arr);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,6,78,84,24,5};
        int k =2;
         Brute(arr,k);

         LeftRotateByk ob = new LeftRotateByk();
         int[] res = ob.optimal(arr, k);
         System.out.println(res.toString());


    }
    
}
