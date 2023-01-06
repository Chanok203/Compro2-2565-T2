package Array2D.NumTable;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class NumTable3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] table = new int[R + 1][C + 1];
        for (int r = 1; r <= R; ++r) {
            for (int c = 1; c <= C; ++c) {
                table[r][c] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        int prev = -1;
        int count = 0;
        int max = 0;
        int countMax = 0;
        for (int n = 0; n < N; ++n) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            boolean validRow = (1 <= r) && (r <= R);
            boolean validCol = (1 <= c) && (c <= C);
            if (validRow && validCol) {
                prev = table[r][c];
                ++count;
                if (count > max) {
                    max = count;
                    countMax = 0;
                }
            } else {
                count = 0;
                prev = -1;
            }
            if (count == max) {
                ++countMax;
            }
        }
        System.out.println(max);
        System.out.println(countMax);
    }
}
