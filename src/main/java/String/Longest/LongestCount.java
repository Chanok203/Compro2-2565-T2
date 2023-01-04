package String.Longest;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class LongestCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int count = 0;
        while (true) {
            String msg = sc.nextLine();
            int L = msg.length();
            if (L == 0) {
                break;
            }

            if (max < L) {
                max = L;
                count = 1;
            } else if (max == L) {
                ++count;
            }

//            System.out.println(L + " " + max + " " + count);
        }
        System.out.println(max);
        System.out.println(count);
    }
}
