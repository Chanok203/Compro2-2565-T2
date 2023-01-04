package String.Longest;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class LongestString4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String longestStr = "";
        while (true) {
            String msg = sc.nextLine();
            int L = msg.length();
            if (L == 0) {
                break;
            }

            if (longestStr.length() <= L) {
                longestStr = msg;
            }
        }
        System.out.println(longestStr);
    }
}
