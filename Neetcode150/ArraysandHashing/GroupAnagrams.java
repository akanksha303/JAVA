package Neetcode150.ArraysandHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    
    public static List<List<String>> Anagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = Anagrams(strs);

        System.out.println(result);
    }

    
}
