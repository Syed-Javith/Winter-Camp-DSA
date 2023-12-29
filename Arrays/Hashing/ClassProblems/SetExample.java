import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i + 1);
        }
        for (int e : set) {
            System.out.println(e);
        }
        set.add(5);
        for (int e : set) {
            System.out.println(e);
        }
        set.remove(2);
        for (int e : set) {
            System.out.println(e);
        }
    }
}
