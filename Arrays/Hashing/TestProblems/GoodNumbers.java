import java.util.HashMap;
import java.util.Scanner;

public class GoodNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            a[i] = sc.nextInt();
            int count = map.getOrDefault(a[i],0);
            map.put(a[i],count+1);
        }
        int sum = 0;
        for(int i : map.values()){
            if(i > 1){
                sum += (i-1)*i/2;
            }
        }  
        System.out.println(sum);      
    }
}
