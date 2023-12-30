import java.util.*;

public class MaxPrefixSum {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] prefix = new int[n];
        prefix[0] = a[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        for (int i = 0; i < n; i++) {
            int maxL = Math.max(prefix[i], prefix[n - 1] - prefix[i] + a[i]);
            if (maxL > max)
                max = maxL;
        }
        System.out.println(max);
    }
}
// new