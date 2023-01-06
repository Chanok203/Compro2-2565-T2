package String.CharCount;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class CharCount2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chars = new int[26];
        int K = sc.nextInt();
        sc.nextLine();
        int count = 0;
        while (true) {
            String msg = sc.nextLine();
            ++count;
            for (int i = 0; i < msg.length(); ++i) {
                char c = msg.charAt(i);
                int index = c - 'A';
                ++chars[index];
                if (chars[index] == K) {
                    System.out.println(c);
                    System.out.println(count);
                    return;
                }
            }
        }
    }
}
