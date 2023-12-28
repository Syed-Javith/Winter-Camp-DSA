package SlidingWindow.TestProblems;
import java.util.*;
public class LargestSumSubArray {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int r = 0 , l =0 , curr =0 , ans = 0 ;
        for(r=0;r<n;r++){
            curr += a[r];   
            if(r-l+1>k){
                curr -= a[l];
                l++;
            }
            ans = Math.max(ans, curr);
        }
        System.out.println(ans);
    }
}
