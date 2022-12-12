package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ConsecSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rooms = new int[N];
        int P = sc.nextInt();
        int K = sc.nextInt();
        for (int k = 0; k < K; ++k) {
            int i = sc.nextInt() - P;
            if (0 <= i && i < N) {
                ++rooms[i];
            }
        }
        int count = 0;
        for (int i = 0; i < N; ++i) {
            if (rooms[i] == 0) {
                ++count;
            }
        }
        System.out.println(count);
        
        int max = 0;
        int current = 0;
        for (int i = 0; i < N; ++i) {
            if (rooms[i] == 0) {
                ++current;
                if (max < current) {
                    max = current;
                }
            } else {
                current = 0;
            }
        }
        System.out.println(max);
    }
}
