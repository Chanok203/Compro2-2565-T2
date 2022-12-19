package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Labor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] lands = new int[N+1];
        int[] labors = new int[N+1];
        for (int i = 1; i <= N; ++i) {
            lands[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; ++i) {
            labors[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        for (int q = 1; q <= Q; ++q) {
            int K = sc.nextInt();
            int M = sc.nextInt();
            
            int start = M - K/2;
            int stop = M + K/2;
            
            boolean isOut = start < 1 || N < stop;
            if (isOut) {
                System.out.print("no ");
            }
            if (start < 1) {
                start = 1;
            }
            if (N < stop) {
                stop = N;
            }
            
            int sum = 0;
            boolean isLabor = true;
            for (int i = start; i <= stop; ++i) {
                sum += lands[i];
                if (labors[i] < 5) {
                    isLabor = false;
                }
            }
            
            if (isLabor && !isOut) {
                System.out.println(sum + " labor");
            } else {
                System.out.println(sum);
            }
            
        }
    }
}
