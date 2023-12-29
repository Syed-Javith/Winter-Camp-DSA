package Hashing.ClassProblems;

import java.util.*;

public class SumWithTargetHashMap {
    private static final String HashMap = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0 ;i<n;i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(a[i], i);
        }
        for(int i = 0 ;i <n ; i++){
            int complement = Math.abs(target - a[i]);
            if(map.containsKey(complement)){
                System.out.println(i + " " + map.get(complement));
                return ;
            }
        }
    }
}
