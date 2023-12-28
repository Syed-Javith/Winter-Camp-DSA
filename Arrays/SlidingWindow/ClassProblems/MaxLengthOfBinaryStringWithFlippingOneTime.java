// Given a binary string(0's and 1's) find the longest substring length where you can flip atmost 1 bit to make the substringas 1
public class MaxLengthOfBinaryStringWithFlippingOneTime {
    public static void main(String[] args) {
		String str = "11011000111";
		int l = 0 , r = 0 , curr = 0 , ans = 0;
		for(r=0;r<str.length();r++){
		    if(str.charAt(r) == '0'){
		          curr++;  
		    }
		    while(curr > 1){
		        if(str.charAt(l) == '0'){
		          curr--; 
		          
		        }
		        l++;
		    }
		    ans = Math.max(ans, r - l + 1);
		}
		System.out.println(ans);
	}
}