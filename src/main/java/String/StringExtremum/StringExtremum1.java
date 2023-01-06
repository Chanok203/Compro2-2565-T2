package String.StringExtremum;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class StringExtremum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int process = sc.nextInt();
        
        int max = -1;
        int min = 1_001;
        String ans = "";
        
        sc.nextLine();
        while (true) {
            String msg = sc.nextLine();
            int L = msg.length();
            if (L == 0) {
                break;
            }
            if (process == 1 && max <= L) {
                max = L;
                ans = msg;
            }
            
            if (process == 2 && L <= min) {
                min = L;
                ans = msg;
            }
        }
        
        if (process == 1) {
            System.out.println(max);
        } else if (process == 2) {
            System.out.println(min);
        }
        System.out.println(ans);
    }
}
