import java.util.*;
public class PrefixSum {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] pivot = new int[n];
        a[0] = pivot[0] = sc.nextInt();
        int max = 0;
        System.out.print(pivot[0]+" ");
        for(int i = 1 ; i < n ; i++){
            a[i] = sc.nextInt();
            pivot[i] = pivot[i-1] + a[i];
            System.out.print(pivot[i] + " ");
        }
    }
}
