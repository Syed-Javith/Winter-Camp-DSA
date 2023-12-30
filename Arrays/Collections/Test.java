import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 4, 5, 1, 2, 6, 7 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int count = map.getOrDefault(a[i], 0);
            map.put(a[i], count + 1);
        }
        for (int i = 0; i < b.length; i++) {
            if (!map.containsKey(b[i]) || map.get(b[i]) == 0) {
                System.out.println(b[i]);
            } else {
                int count = map.getOrDefault(b[i], 0);
                map.put(b[i], count - 1);
            }
        }
    }
}
