package Hashing.ClassProblems;

import java.util.*;

public class MultipleArrayIntersectionHashMap {
    public static void main(String[] args) {
        int[][] arrays = { { 3, 1, 3, 4, 5 }, { 1, 2, 3, 4 }, { 3, 4, 5, 6 } };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] row : arrays) {
            for (int e : row) {
                int count = map.getOrDefault(e, 0);
                map.put(e, count + 1);
            }
        }
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 3) {
                System.out.println(key + " ");
            }
        }
    }
}
// new