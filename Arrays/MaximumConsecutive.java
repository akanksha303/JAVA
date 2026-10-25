import java.util.Scanner;

public class MaximumConsecutive {
    public static int consective(int[] arr){
        int count =0;
        int maxs=0;

        for(int i =0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
            }
           else {
            count = 0;
        }

            maxs = Math.max(maxs, count);
        }
        return maxs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(consective(arr));
        sc.close();


    }
    
}
