import java.util.*;

public class OutOfrange {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
                return;
            }
        }
    }
}