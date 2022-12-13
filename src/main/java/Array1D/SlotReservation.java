package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
 public class SlotReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N+1];
        
        int K = sc.nextInt();
        int P = sc.nextInt();
        for (int p = 0; p < P; ++p) {
            int i = sc.nextInt();
            if (A[i] < K) {
                A[i] += 1;
                System.out.println("1");
            } else {
                B[i] += 1;
                System.out.println("2");
            }
        }
        for (int i = 1; i <= N ;++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 1; i <= N ;++i) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }
}
