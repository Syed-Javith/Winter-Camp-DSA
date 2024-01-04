package Stack;

public class MultipleDeleteUndo {
    public static String addElements(String s) {
        StringBuilder stk = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '^' && ch != ' ') {
                stk.append(temp.charAt(temp.length() - 1));
                temp.deleteCharAt(temp.length() - 1);
            } else if (stk.length() > 0 && ch == '#') {
                temp.append(stk.charAt(stk.length() - 1));

                stk.deleteCharAt(stk.length() - 1);
            } else {
                stk.append(ch);
            }
        }
        return stk.toString();
    }

    public static void main(String[] args) {
        String s = "ab##^^c";
        String t = "ad#bc";
        System.out.println(addElements(s));
        System.out.println(addElements(t));
        System.out.println(addElements(s).equals(addElements(t)));
    }
}
