import java.io.*;
import java.util.*;
public class LuckyNumber {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            int count = map.getOrDefault(a[i], 0);
            map.put(a[i],count+1);
        }
        int max = -1;
        for(int k : map.keySet()){
            if(map.get(k) == k && k > max){
                max = k;
            }
        }
        System.out.println(max);
        
    }
}