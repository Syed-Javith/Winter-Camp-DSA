public class MaxContSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -2, 5 };
        int l = 0, r = 0, ans = Integer.MIN_VALUE, curr = 0;
        for (r = 0; r < arr.length - 1; r++) {
            curr += arr[r];
            System.out.print(curr);
            while (curr < curr + arr[r]) {
                curr -= arr[l];
                // if(l>arr.length)
                //  break;
                l++;
            }
            ans = Math.max(curr, ans);
            System.out.println(" " +ans);
        }
        System.out.println(ans);
    }
}
