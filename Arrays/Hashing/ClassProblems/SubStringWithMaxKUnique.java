import java.util.HashMap;

public class SubStringWithMaxKUnique {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "eceba";
        int k = 2;
        int ans = 0, l = 0, r = 0, curr = 0;
        for (r = 0; r < str.length(); r++) {
            char rch = str.charAt(r);
            map.put(rch, map.getOrDefault(rch, 0) + 1);
            while (map.size() > k) {
                char ch = str.charAt(l);
                map.put(ch, map.getOrDefault(ch, 0) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        System.out.println(ans);
    }
}
// new