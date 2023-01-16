package Method;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class UnderLineWithParameter {
    static void underline(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            String word = sc.next();
            int num = sc.nextInt();
            System.out.println(word);
            underline(num);
        }
    }
}
