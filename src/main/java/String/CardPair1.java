package String;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class CardPair1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            String P1 = sc.next();
            String P2 = sc.next();
            
            int c1 = (P1.charAt(0) < P1.charAt(1)) ? P1.charAt(0) : P1.charAt(1);
            int c2 = (P2.charAt(0) < P2.charAt(1)) ? P2.charAt(0) : P2.charAt(1);
            
            if (c1 < c2) {
                System.out.print("W");
            } else if (c1 == c2){
                System.out.print("D");
            } else {
                System.out.print("L");
            }
        }
        System.out.println();
    }
}
