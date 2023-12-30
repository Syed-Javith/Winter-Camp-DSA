import java.util.*;

public class SumOfOneOccurenceNumber {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            int count = map.getOrDefault(a[i], 0);
            map.put(a[i], count+1);
        }
        int sum = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                sum +=key;
            }
        }
        System.out.println(sum);
    }
}
