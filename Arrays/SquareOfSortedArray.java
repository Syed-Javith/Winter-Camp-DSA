public class SquareOfSortedArray {
    public static void squareOfSortedArray(int[] arr) {
        int k = arr.length - 1;
        int[] ans = new int[k + 1];
        int i = 0, j = k;
        while (i < j) {
            if (Math.abs(arr[i]) < Math.abs(arr[j])) {
                ans[k] = arr[j] * arr[j];
                k--;
                j--;
            } else {
                ans[k] = arr[i] * arr[i];
                k--;
                i++;
            }
        }
        for (int e : ans) {
            System.out.println(e + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        squareOfSortedArray(arr);
    }
}
