package Neetcode150.ArraysandHashing;

public class ValidAnagrams {
    public Boolean valid(String s, String t){

        int n = s.length();
        int k = t.length();

        if(n!=k){
            return false;
        }

        int[] freq = new int[26];
        int[] freq1 = new int[26];

        for(int i=0; i<n; i++){

            char ch = s.charAt(i);
            char rh = t.charAt(i);

            freq[ch-'a']++;
            freq1[rh-'a']++;
        }

        for(int i=0; i<n; i++){
            if(freq[i]!=freq1[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        ValidAnagrams ob = new ValidAnagrams();
        System.out.print(ob.valid(s, t));
    }
    
}
