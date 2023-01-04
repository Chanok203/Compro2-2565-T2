package Array1D.Auction;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Auction2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] counts = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        for (int k = 0; k < K; ++k) {
            for (int i = 1; i <= N; ++i) {
                int v = sc.nextInt();
                if (arr[i] < v && counts[i] < 3) {
                    arr[i] = v;
                    counts[i] = 0;
                } else {
                    ++counts[i];
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
