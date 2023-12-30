package SlidingWindow.TestProblems;

import java.util.*;

public class MinLengthOfSumGreaterThanK {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int r = 0, l = 0, curr = 0, ans = Integer.MAX_VALUE;
        for (r = 0; r < n; r++) {
            curr += arr[r];
            if (r == n - 1) {
                if (curr < k) {
                    ans = 0;
                }
            }
            while (curr >= k) {
                ans = Math.min(ans, r - l + 1);
                curr -= arr[l];
                l++;
            }
        }
        System.out.println(ans);
    }
}
