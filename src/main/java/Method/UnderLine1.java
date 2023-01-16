package Method;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class UnderLine1 {
    
    static void underline() {
        System.out.println("--------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            String word = sc.next();
            System.out.println(word);
            underline();
        }
    }
}
