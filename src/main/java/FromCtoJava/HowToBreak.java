package FromCtoJava;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class HowToBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            ++count;
        }
        System.out.println(count);
    }
}
