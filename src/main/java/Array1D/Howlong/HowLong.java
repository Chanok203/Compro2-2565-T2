package Array1D.Howlong;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class HowLong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            arr[i] = sc.nextInt();
        }
        for (int n = 0; n < 3; ++n) {
            int a = sc.nextInt();
            int count = 0;
            for (int i = a; i <= N; ++i) {
                if (arr[i] == 0) {
                    break;
                }
                ++count;
            }
            System.out.println(count);
        }
    }
}
