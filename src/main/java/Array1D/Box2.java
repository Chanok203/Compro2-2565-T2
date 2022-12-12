package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Box2 {

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
            if (a == 1) {
                int B = sc.nextInt();
                if (boxes[B] + Q <= max[B]) {
                    boxes[B] += Q;
                    System.out.println(boxes[B]);
                } else {
                    System.out.println("-1");
                }
            } else {
                for (int i = 1; i <= N; ++i) {
                    if (Q - boxes[i] > 0) {
                        Q -= boxes[i];
                        boxes[i] = 0;
                    } else {
                        boxes[i] -= Q;
                        Q = 0;
                        System.out.println(i + " " + boxes[i]);
                        break;
                    }
                }
                if (Q > 0) {
                    System.out.println(N + " 0");
                }
            }
        }
    }
}
