// Given a String revese it inpalce
public class ReverseString {
    public static void main(String[] args) {
        char[] str = "Hello World".toCharArray();
        int i = 0, j = str.length - 1;
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            j--;
            i++;
        }
        for (char c : str) {
            System.out.print(c);
        }
    }
}
