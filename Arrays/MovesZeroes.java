import java.util.*;
public class MovesZeroes {
    public int[] Zeroes(int[] nums, int n){
        int j=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                j++;

            }
        }
        return nums;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*String line = sc.nextLine();
        
        ArrayList<Integer> map = new ArrayList<>();
        for(String s :line.split(" ")){
            map.add(Integer.parseInt(s));
        }*/

            ArrayList<Integer> map = new ArrayList<>();
            while(sc.hasNextInt()){
                map.add(sc.nextInt());
            }

            System.out.println(map);
            sc.close();
    }
    
}
