package PrefixSum;

import java.util.Scanner;

public class SplitArrayUsingPrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0 ; i < n ; i++){
		    nums[i] = sc.nextInt();
		}
		int[] prefix = new int[n];
		prefix[0] = nums[0];
		for(int i = 1; i < n ; i++){
		 prefix[i] = prefix[i-1]+nums[i];   
		}
		int count = 0 ;
		for(int i = 0 ; i < n-1 ; i++){
		   if(prefix[n] - prefix[i+1] + nums[i+1] < prefix[i])
		    count++;
		}
		System.out.println(count);
    }
}
