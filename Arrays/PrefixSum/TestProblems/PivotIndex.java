import java.util.Scanner;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] pivot = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        pivot[0] = a[0];
        for (int i = 1; i < n; i++) {
            pivot[i] = pivot[i - 1] + a[i];
        }
        int ans = -1;
        for (int i = 1; i < n - 1; i++) {
            if (pivot[i - 1] == pivot[n - 1] - pivot[i]) {
                ans = i;
            }
        }
        if (pivot[n - 1] == pivot[0]) {
            ans = 0;
        } else if (pivot[n - 1] == a[n - 1]) {
            ans = n - 1;
        }
        System.out.println(ans);
    }
}
