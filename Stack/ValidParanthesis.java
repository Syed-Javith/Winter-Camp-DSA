package Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Stack<Character> stk = new Stack<>();
        String str = "{}[]}";
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (int i = 0; i < str.length(); i++) {
            if ("}])".contains(str.charAt(i) + "")) {
                if (stk.isEmpty()) {
                    System.out.println(false);
                    return;
                } else if (stk.pop() != map.get(str.charAt(i))) {
                    System.out.println(false);
                    return;
                }
            } else
                stk.push(str.charAt(i));
        }
        if (stk.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
