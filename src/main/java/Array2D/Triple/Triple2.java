package Array2D.Triple;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Triple2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R+1][C+1];
        for (int r = 1; r <= R; ++r) {
            for (int c = 1; c <= C; ++c) {
                arr[r][c] = sc.nextInt();
            }
        }
        int v = sc.nextInt();
        for (int r = 1; r <= R; ++r) {
            int[] row = arr[r];
            int first = -1;
            int last = -1;
            for (int c = 1; c <= C - 2; ++c) {
                if (row[c] == v && row[c+1] == v && row[c+2] == v) {
                    last = c;
                    if (first == -1) {
                        first = c;
                    }
                }
            }
            if (first == -1 && last == -1) {
                System.out.println("0");
            } else {
                System.out.println(first + " " + last);
            }
            
        }
    }
}
