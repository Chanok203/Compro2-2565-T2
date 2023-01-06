package String.CharCount;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        int[] chars = new int[26];
        for (int i = 0; i < msg.length(); ++i) {
            char c = msg.charAt(i);
            int index = c - 'A';
            ++chars[index];
        }
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] > 0) {
                char c = (char) (i + 'A');
                int count = chars[i];
                System.out.println(c + " " + count);
            }
        }
        System.out.println();
    }
}
