package String.PPAP;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class PPAP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String PPAP = "PPAP";
        String GOD = "GOD";
        
        if (msg.indexOf(PPAP) == -1) {
            System.out.println("clean");
        } else {
            int firstPPAP = msg.indexOf(PPAP);
            int lastPPAP = msg.lastIndexOf(PPAP);
            
            int firstGOD = msg.indexOf(GOD);
            int lastGOD = msg.lastIndexOf(GOD);
            
            boolean left = (firstGOD < firstPPAP);
            boolean right = (lastPPAP < lastGOD);
            if ( left && right ) {
                System.out.println("safe");
            } else {
                System.out.println("danger");
            }
        }
    }

}
