package Hashing;
import  java.util.*;

public class LongestConsecutive {

    public static int Longest(int[] nums){
        HashSet<Integer> set  = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int log = 0;
        for(int num: nums){

            if(!set.contains(num-1)){
                int curr = num;
                int count =1;

                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                log = Math.max(log,count);
            }

        } return log;
    }
    
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(Longest(arr));
    }
}
