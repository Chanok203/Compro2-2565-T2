package String.CharWatch;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class CharWatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        String msg = sc.next();
        int N = sc.nextInt();
        
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countFail = 0;
        
        for (int i = 0; i < N; ++i) {
            int index = sc.nextInt() - 1;
            if (index < 0 || msg.length() <= index) {
                ++countFail;
                continue;
            }
            if (msg.charAt(index) == a) {
                ++countA;
            }
            if (msg.charAt(index) == b) {
                ++countB;
            }
            if (msg.charAt(index) == c) {
                ++countC;
            }
        }
        System.out.println(countA);
        System.out.println(countB);
        System.out.println(countC);
        System.out.println(countFail);
    }
}
