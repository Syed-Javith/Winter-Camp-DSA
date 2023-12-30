import java.util.*;

public class PangramHashMapSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), 1);
        }
        for (int i = 0; i < 26; i++) {
            int ascii = i + 97;
            char ch = (char) ascii;
            if (map.get(ch) == null) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
// new