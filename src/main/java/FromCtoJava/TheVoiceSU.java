package FromCtoJava;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class TheVoiceSU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A = 0, B = 0;
        for (int n = 1; n <= N; ++n) {
            int g = sc.nextInt();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();

            if (s1 >= 9 && A < K && s2 < 9) {
                System.out.println(n + " 1");
                ++A;
            } else if (s2 >= 9 && B < K && s1 < 9) {
                System.out.println(n + " 2");
                ++B;
            } else if (s1 >= 9 && s2 >= 9) {
                if (A < K && B < K) {
                    if (g == 1) {
                        System.out.println(n + " 1");
                        ++A;
                    } else {
                        System.out.println(n + " 2");
                        ++B;
                    }
                } else if (A < K) {
                    System.out.println(n + " 1");
                    ++A;
                } else if (B < K) {
                    System.out.println(n + " 2");
                    ++B;
                }
            }
        }
    }

}
