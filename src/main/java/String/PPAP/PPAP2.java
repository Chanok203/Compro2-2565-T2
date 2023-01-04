package String.PPAP;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class PPAP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int i = 0;
        while (true) {
            i = msg.indexOf("PPAP", i);
            int nextPPAP = msg.indexOf("PPAP", i + 4);
            int nextGOD = msg.indexOf("GOD", i + 4);
            
            if (nextPPAP < nextGOD) {
                System.out.println(nextPPAP + 4);
                break;
            }
            i++;
        }
    }
}
