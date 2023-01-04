package Array2D.BattleShip;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ShotCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int k = 0; k < K; ++k) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            boolean validRow = (1 <= r) && (r <= R);
            boolean validCol = (1 <= c) && (c <= C);
            if (!validRow || !validCol) {
                ++out;
            } else {
                ++in;
            }
        }
        System.out.println(in);
        System.out.println(out);
    }
}
