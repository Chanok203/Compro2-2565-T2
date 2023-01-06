package Array2D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class CovidRisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();
        int[][] map = new int[R+2][C+2];
        int maxRisk = -1;
        for (int n = 0; n < N; ++n) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            ++map[r][c];
            for (int i = r - 1; i <= r + 1; ++i) {
                for (int j = c - 1; j <= c + 1; ++j) {
                    ++map[i][j];
                    if (maxRisk < map[i][j]) {
                        maxRisk = map[i][j];
                    }
                }
            }
        }
        
        for (int r = 1; r <= R; ++r) {
            for (int c = 1; c <= C; ++c) {
                System.out.print(map[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(maxRisk);
        for (int r = 1; r <= R; ++r) {
            boolean foundMax = false;
            for (int c = 1; c <= C; ++c) {
                if (map[r][c] == maxRisk) {
                    foundMax = true;
                    break;
                }
            }
            if (foundMax) {
                System.out.print(r + " ");
            }
        }
        System.out.println();
    }
}
