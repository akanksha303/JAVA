import java.util.*;

public class FindMissingRepeating {

    public List<Integer> sorts(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        List<Integer> map = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]!=i+1){
                map.add(i+1);
                map.add(arr[i]);
            }
        }
        Collections.sort(map);
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5};
        FindMissingRepeating ob = new FindMissingRepeating();
        System.out.println(ob.sorts(arr));
    }
    
}
