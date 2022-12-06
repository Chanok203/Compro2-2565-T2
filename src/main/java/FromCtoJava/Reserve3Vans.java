package FromCtoJava;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Reserve3Vans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0, C = 0;
        int N = sc.nextInt();
        for (int n = 0 ; n < N ; ++n) {
            int t = sc.nextInt();
            if (A <= B && A <= C) {
                System.out.println("A");
                A += t;
            } else if (B <= C) {
                System.out.println("B");
                B += t;
            } else {
                System.out.println("C");
                C += t;
            }
        }
    }
}
