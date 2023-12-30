package Hashing.ClassProblems;

import java.util.*;

public class FrequencyEqualInStringUsingHashSet {
    public static void main(String[] args) {
        String str = "aaaabbccc";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count = map.getOrDefault(str.charAt(i), 0);
            count = (count % 2 == 1) ? 2 : 1; // if the frequency is even time set count = 1 , else count = 2
            map.put(str.charAt(i), count);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        System.out.println(set.size() == 1);
    }
}
