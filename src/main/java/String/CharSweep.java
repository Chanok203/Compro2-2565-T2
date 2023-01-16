package String;

import java.util.Scanner;


/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class CharSweep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        int index = sc.nextInt();
        int direction = sc.nextInt();
        int L = msg.length();
        char c1 = msg.charAt(index);
        if (direction == 1) {
            // index -> last
            for (int i = index; i < L; ++i) {
                char c2 = msg.charAt(i);
                if (c1 <= c2) {
                    System.out.print(c2);
                }
            }
            // first -> index
            for (int i = 0; i < index; ++i) {
                char c2 = msg.charAt(i);
                if (c1 <= c2) {
                    System.out.print(c2);
                }
            }
        } else {
            // index -> first
            for (int i = index; i >= 0; --i) {
                char c2 = msg.charAt(i);
                if (c1 <= c2) {
                    System.out.print(c2);
                }
            }
            // last -> index
            for (int i = L-1; i > index; --i) {
                char c2 = msg.charAt(i);
                if (c1 <= c2) {
                    System.out.print(c2);
                }
            }
        }
        System.out.println();
    }
}
