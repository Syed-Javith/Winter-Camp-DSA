package Stack;

public class AdjacentDuplicates {
    public static void main(String[] args) {
        String str = "abbaca";
        StringBuilder stk = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (stk.length() > 0 && c == stk.charAt(stk.length() - 1)) {
                stk.deleteCharAt(stk.length() - 1);
            } else {
                stk.append(c);
            }
        }
        System.out.println(stk);
    }
}
