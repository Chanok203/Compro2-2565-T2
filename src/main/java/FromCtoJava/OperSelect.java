package FromCtoJava;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class OperSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        if (z == 1) {
            System.out.println(x + y);
        } else if (z == 2) {
            System.out.println(x - y);
        } else if (z == 3) {
            System.out.println(x * y);
        } else {
            if (y == 0) {
                System.out.println("cannot divide by zero");
                return;
            }
            
            if (z == 4) {
                System.out.println(x / y);
            } else if (z == 5) {
                System.out.println(x % y);
            }
        }
    }
}
