package Array1D.Howlong;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class HowLongest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int current = 0;
        for (int i = 1; i <= N; ++i) {
            if (arr[i] == 1) {
                ++current;
                if (max < current) {
                    max = current;
                }
            } else {
                current = 0;
            }
        }
        System.out.println(max);
        
        for (int i = 1; i <= N; ++i) {
            if (arr[i] == 1) {
                ++current;
                if (current == max) {
                    System.out.print((i - max + 1) + " ");
                }
            } else {
                current = 0;
            }
        }
    }
}
