package SlidingWindow.TestProblems;

import java.util.*;
public class MultipleOneFlip {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = 0 , curr = 0 , l = 0 , r = 0 ;
        for(r=0;r<n;r++){
            //incrementing rigth (i.e., increasing size of window )
            if(a[r] == 0){
                // increasing no.of.zeros
                curr++;
            }
            if(curr > k){
                //if zeros frequency exceed from the given
                if(a[l] == 0){
                    // decreasing the window from left and also zeros frequency
                    curr--;                    
                }
                l++;
            }
            // choosing better value
            ans = Math.max(ans, r - l + 1);
        } 
        System.out.println(ans);
    }
}

