

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int[][] queries = {{ 0,3 },{2,5},{2,4}};
		
		for(int i = 0 ; i < n ; i++){
		    nums[i] = sc.nextInt();
		}
		int limit = sc.nextInt();
		int[] prefix = new int[n];
		prefix[0] = nums[0];
		for(int i = 1; i < n ; i++){
		 prefix[i] = prefix[i-1]+nums[i];   
		}
		for(int i = 0 ; i < 3 ; i++){
		    int x = queries[i][0];
		    int y = queries[i][1];
		    System.out.println((prefix[y] - prefix[x] + nums[x] < limit)? true : false);
		}
    }
}
