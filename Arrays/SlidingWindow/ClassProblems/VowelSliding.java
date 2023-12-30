package SlidingWindow.TestProblems;

import java.util.*;

public class VowelSliding {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        int l = 0, n = str.length(), r = 0, ans = 0, curr = 0;
        for (r = 0; r < n; r++) {
            if ("aeiou".contains(str.charAt(r) + "")) {
                curr++;
            }
            while (r - l + 1 > k) {
                if ("aeiou".contains(str.charAt(l) + "")) {
                    curr--;
                }
                l++;
            }
            ans = Math.max(ans, curr);
        }
        System.out.println(ans);
    }
}
