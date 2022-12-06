package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] votes = new int[N+1];
        for (int i = 0 ; i < K ; ++i) {
            int k = sc.nextInt();
            ++votes[k];
        }
        int max = -1;
        int winner = -1;
        for (int i = 1 ; i <= N ; ++i) {
            if (votes[i] > max) {
                winner = i;
                max = votes[i];
            }
        }
        System.out.println(winner);
        System.out.println(max);
    }
}
