package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class TargetLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] lands = new int[N+1];
        for (int i = 1; i <= N; ++i) {
            lands[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        for (int q = 1; q <= Q; ++q) {
            int K = sc.nextInt();
            int M = sc.nextInt();
            
            int start = M - K/2;
            int stop = M + K/2;
            if (start < 1 || N < stop) {
                System.out.println("no");
                continue;
            }
            
            int sum = 0;
            for (int i = start; i <= stop; ++i) {
                sum += lands[i];
            }
            System.out.println(sum);
            
        }
    }
}
