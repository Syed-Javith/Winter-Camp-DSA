import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PangramHashMap {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, 1);
        }
        int count = 0;
        for (int m : map.values()) {
            if (m == 1) {
                count++;
            }
        }
        if (count == 26) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}