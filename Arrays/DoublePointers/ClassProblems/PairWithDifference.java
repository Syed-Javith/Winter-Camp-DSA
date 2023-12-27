// Given an array find the pair with given difference K 
public class PairWithDifference {
    public static boolean pairWithDifference(int[] arr, int target) {
        int i = 0, j = 1;
        while (j < arr.length) {
            int diff = Math.abs(arr[i] - arr[j]);
            if (diff == target)
                return true;
            if (diff > target)
                j++;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 9, 20, 55, 73 };
        int target = 53;
        System.out.println(pairWithDifference(arr, target));
    }
}
