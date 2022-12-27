package String;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String cut = sc.nextLine();
        int L = msg.length();
        int prev = 0;
        int i = msg.indexOf(cut);
        
        if (i == -1) {
            System.out.println("no target character found");
            return;
        }
        boolean printed = false;
        while (i != -1) {
            
            String sub = msg.substring(prev, i);
            if (sub.length() > 0) {
                System.out.println(sub);
                printed = true;
            }
            
            prev = i+1;
            i = msg.indexOf(cut, i+1);
        }
        String sub = msg.substring(prev, L);
        if (sub.length() > 0) {
            System.out.println(sub);
            printed = true;
        }
        if (!printed) {
            System.out.println("no output");
        }
    }
}
