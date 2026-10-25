import java.util.HashMap;


public class MajorityElement {
    public int Majority(int[] nums){
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        MajorityElement ob = new MajorityElement();
        int[] arr = {3,4,5,6,6,6,6,7};
        System.out.println(ob.Majority(arr));
    }
    
}
