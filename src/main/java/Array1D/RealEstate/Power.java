package Array1D.RealEstate;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] lands = new int[N+1];
        int[] labors = new int[N+1];
        int[] powers = new int[N+1];
        for (int i = 1; i <= N; ++i) {
            lands[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; ++i) {
            labors[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; ++i) {
            powers[i] = sc.nextInt();
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
            boolean isPower = false;
            for (int i = start; i <= stop; ++i) {
                sum += lands[i];
                if (labors[i] < 5) {
                    isLabor = false;
                }
                if (powers[i] > 0) {
                    isPower = true;
                }
            }
            
            if (!isOut) {
                System.out.print(sum);
                if (isLabor) {
                    System.out.print(" labor");
                }
                if (isPower) {
                    System.out.print(" power");
                }
                System.out.println();
            } else {
                System.out.println(sum);
            }
            
        }
    }
}
