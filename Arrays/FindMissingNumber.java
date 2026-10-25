import java.util.*;
class FindMissingNumber{
    public static int missingnumber(int[] nums){
        int xor=0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            xor^=i^nums[i]; 
        }
        return xor;

        
    }

    public  int Brute(int[] nums){
        int n = nums.length;
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<n; i++){
            map.add(nums[i]);
        }
        for(int i=0; i<=n; i++){
            if(!map.contains(i)){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> map = new ArrayList<>();
        while(sc.hasNextInt()){
            map.add(sc.nextInt());
        }

        int[] arr = {3,5,6,7,7,8};
        FindMissingNumber ob = new FindMissingNumber();
        System.out.println(ob.Brute(arr));

        System.out.println(map);
        sc.close();
        
    }
}