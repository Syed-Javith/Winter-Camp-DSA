package PrefixSum.TestProblems;

import java.util.*;

public class MinimumNumAddedToMakeSumGreaterThanOne {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] pivot = new int[n];
        pivot[0] = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++) {
            pivot[i] = pivot[i - 1] + a[i];
            if (pivot[i] < min)
                min = pivot[i];
        }
        System.out.println((min < 0) ? min * -1 + 1 : min);
    }
}
