import java.util.*;

public class IntersectionTwoSorted {
 public int[] sort(int[] nums1, int[] nums2) {

    HashSet<Integer> set = new HashSet<>();

    for(int num : nums2){
        set.add(num);
    }

    HashSet<Integer> ans = new HashSet<>();

    for(int num : nums1){
        if(set.contains(num)){
            ans.add(num);
        }
    }

    int[] res = new int[ans.size()];
    int i = 0;

    for(int num : ans){
        res[i++] = num;
    }

    return res;
}

    public static void main(String[] args) {
        IntersectionTwoSorted ob = new IntersectionTwoSorted();
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {3,4,5,6};
        System.out.println(ob.sort(arr,arr2));

    }
    
}
