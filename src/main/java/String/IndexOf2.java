package String;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class IndexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String x = sc.nextLine();
        int i = msg.indexOf(x, 0);
        if (i == -1) {
            System.out.println("string not found");
        } else {
            while (i != -1) {
                System.out.print(i+1 + " ");
                i = msg.indexOf(x, i+1);
            }
            System.out.println();
        }
    }
}
