// Given an array nums and integer k find the length of the longest subarray with Sum less than k
public class LengthOfLongestSubArrayWithSumK
{
	public static void main(String[] args) {
		int[] nums = { 3 , 1 ,2 ,7 ,4,2,1,1,5};
		int l = 0 , r = 0 , curr = 0 , ans = 0,k=8;
		for(r=0;r<nums.length;r++){
		    curr += nums[r];
		    while(curr > k){
		        curr -= nums[l];
		        l++;
		    }
		    ans = Math.max(ans, r - l + 1);
		}
		System.out.println(ans);
	}
}                               