import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        al.add(3, 10);
        for (int e : al) {
            System.out.print(e + " ");
        }
        al.remove(10);

        for (int e : al) {
            System.out.print(e + " ");
        }
        al.add(19);
        al.remove(19);
        for (int e : al) {
            System.out.print(e + " ");
        }
    }
}
// new