package String;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class LongestString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        String maxStr = "";
        for (int i = 0; i < 5; ++i) {
            String msg = sc.nextLine();
            int L = msg.length();
            if (max <= L) {
                max = L;
                maxStr = msg;
            }
        }
        System.out.println(maxStr);
    }
}
