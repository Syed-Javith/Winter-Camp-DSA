public class MergeSorted {
    public static void main(String[] args) {
        int[] a1 = { 3, 5, 6, 7, 10 };
        int[] a2 = { 8, 9, 11 };
        int i = 0, j = 0;
        int n = a1.length, m = a2.length, k = 0;
        int[] a = new int[n + m];
        while (i < n && j < m) {
            if (a1[i] > a2[j]) {
                a[k++] = a2[j];
                j++;
            } else if (a1[i] <= a2[j]) {
                a[k++] = a1[i];
                i++;
            }
        }
        while (i < n) {
            a[k++] = a1[i++];
        }
        while (j < m) {
            a[k++] = a2[j++];
        }
        for (int e : a) {
            System.out.println(e);
        }
    }
}