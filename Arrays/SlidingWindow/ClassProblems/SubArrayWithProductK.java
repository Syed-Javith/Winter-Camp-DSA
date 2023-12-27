// Given an array nums and integer k find the length of the longest subarray with Product less than k
public class SubArrayWithProductK {
    public static void main(String[] args) {
		int[] nums = { 10,5,2,6};
		int l = 0 , r = 0 , curr = 1 , ans = 0,k=100,count=0;
		for(r=0;r<nums.length;r++){
		    curr *= nums[r];
		    while(curr >= k){
		        curr /= nums[l];
		        l++;
		    }
		    ans = ans + r - l + 1;
		}
		System.out.println(ans);
	}
}
