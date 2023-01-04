package String.SubMatch;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class SubMatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String sub = sc.nextLine();
        
        for (int i = 0; i < sub.length() - 2; ++i) {
            String a = sub.substring(i, i+3);
            int index = msg.indexOf(a);
            if (index == -1){
                System.out.println("No");
            } else {
                System.out.println(index + 1);
            }
        }        
        
    }
}
