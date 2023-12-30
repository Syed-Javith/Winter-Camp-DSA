import java.util.*;

public class DuplicateUsingHashSet {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(a[i])) {
                System.out.println(true);
                return;
            }
            set.add(a[i]);
        }
        System.out.println(false);
    }
}