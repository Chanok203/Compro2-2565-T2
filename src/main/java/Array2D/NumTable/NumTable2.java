package Array2D.NumTable;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class NumTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] table = new int[R+1][C+1];
        for (int r = 1; r <= R; ++r) {
            for (int c = 1; c <= C; ++c) {
                table[r][c] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        int prev = -1;
        for (int n = 0; n < N; ++n) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            boolean validRow = (1 <= r) && (r <= R);
            boolean validCol = (1 <= c) && (c <= C);
            if (validRow && validCol) {
                if (prev != table[r][c]) {
                    System.out.print(table[r][c]);
                } else {
                    System.out.print("*");
                }
                prev = table[r][c];
            } else {
                if (prev != -1) {
                    System.out.println();
                }
                prev = -1;
            }
        }
        System.out.println();
    }
}
