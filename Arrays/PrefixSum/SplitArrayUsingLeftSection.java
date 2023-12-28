package PrefixSum;

import java.util.Scanner;

public class SplitArrayUsingLeftSection {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ,sum=0;
		int[] nums = new int[n];
		for(int i = 0 ; i < n ; i++){
		    nums[i] = sc.nextInt();
		    sum+=nums[i];
		}
		int count = 0 , lsum=0;
		for(int i = 0 ; i < n-1 ; i++){
		    lsum += nums[i];
		    if(lsum > sum - lsum){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
