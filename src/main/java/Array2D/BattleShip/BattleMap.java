package Array2D.BattleShip;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class BattleMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] map = new int[R+1][C+1];
        for (int r = 1; r <= R; ++r) {
            for (int c = 1; c <= C; ++c) {
                map[r][c] = sc.nextInt();
            }
        }
        int K = sc.nextInt();
        System.out.println(K);
        for (int r = 1; r <= R; ++r) {
            for (int c = 1; c <= C; ++c) {
                System.out.print(map[r][c] + " ");
            }
            System.out.println();
        }
    }
}
