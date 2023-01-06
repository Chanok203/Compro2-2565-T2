package String.CharWatch;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class CharWatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countFail = 0;
        
        int K = sc.nextInt();
        String[] msgs = new String[K];
        for (int k = 0; k < K; ++k) {
            msgs[k] = sc.next();
        }
        
        int N = sc.nextInt();
        for (int i = 0; i < N; ++i) {
            int index = sc.nextInt() - 1;
            
            for (int k = 0; k < K; ++k) {
                String msg = msgs[k];
                if (index < 0 || msg.length() <= index) {
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
        }
        System.out.println(countA);
        System.out.println(countB);
        System.out.println(countC);
    }
}
