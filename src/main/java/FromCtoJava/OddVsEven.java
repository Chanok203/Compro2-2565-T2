package FromCtoJava;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class OddVsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        for (int i = 0 ; i < 8 ; ++i) {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                odd += n;
            } else {
                even += n;
            }
        }
        if (odd < even) {
            System.out.println("even");
        } else if (odd == even) {
            System.out.println("equal");
        } else {
            System.out.println("odd");
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
