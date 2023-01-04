package String.PPAP;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class PPAP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int i = 0;
        while (true) {
            i = msg.indexOf("PPAP", i);
            int nextPPAP = msg.indexOf("PPAP", i + 4);
            int nextPPAP2 = msg.indexOf("PPAP", nextPPAP + 4);
            int nextGOD = msg.indexOf("GOD", i + 4);
            
            if (nextPPAP2 < nextGOD) {
                System.out.println(nextPPAP2 + 4);
                break;
            }
            i++;
        }
    }
}
