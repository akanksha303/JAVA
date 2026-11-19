import java.util.*;

public class FindMissingRepeating {

    public List<Integer> sorts(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        int repeating = -1;
        int missing =-1;

        if(arr[0]!=1){
            missing =1;
        }

        for(int i=1; i<n; i++){
             if(arr[i] == arr[i-1])
            repeating = arr[i];
           if(arr[i] > arr[i-1] + 1)
            missing = arr[i-1] + 1;
        }
        if(arr[n-1] != n)
        missing = n;

        return Arrays.asList(missing, repeating);
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5};
        FindMissingRepeating ob = new FindMissingRepeating();
        System.out.println(ob.sorts(arr));
    }
    
}
