import java.util.*;

public class UniqueNumberOfOccurences {
    public static void main(String args[]) throws Exception {
       Scanner sc  = new Scanner(System.in);
       int n = sc.nextInt();
       int[] a = new int[n];
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0 ; i < n ; i++){
           a[i] = sc.nextInt();
           int count = map.getOrDefault(a[i], 0);
           map.put(a[i],count+1);
       }
       HashSet<Integer> set = new HashSet<>(map.values());
       System.out.println(map.size() == set.size());
    }
}

