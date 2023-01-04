package Array1D.Box;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Box1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] max = new int[N + 1];
        int[] boxes = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            max[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        for (int k = 0; k < K; ++k) {
            int a = sc.nextInt();
            int Q = sc.nextInt();
            int B = sc.nextInt();

            if (a == 1) {
                if (boxes[B] + Q <= max[B]) {
                    boxes[B] += Q;
                    System.out.println(boxes[B]);
                    continue;
                }
            } else {
                if (boxes[B] - Q >= 0) {
                    boxes[B] -= Q;
                    System.out.println(boxes[B]);
                    continue;
                }
            }
            System.out.println("-1");
        }
    }
}
