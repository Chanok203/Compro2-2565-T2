package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class TeamCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read Input
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; ++i) {
            B[i] = sc.nextInt();
        }
        
        // Process
        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < N; ++i) {
            if (A[i] > B[i]) {
                scoreA += 2;
            } else if (A[i] == B[i]) {
                scoreA += 1;
                scoreB += 1;
            } else {
                scoreB += 2;
            }
        }
        
        // Output
        if (scoreA > scoreB) {
            System.out.println("Team 1 wins");
            System.out.printf("Score %d to %d", scoreA, scoreB);
            System.out.println();
        } else if (scoreA == scoreB) {
            System.out.println("Draw game");
            System.out.printf("Score %d to %d", scoreA, scoreB);
            System.out.println();
        } else {
            System.out.println("Team 2 wins");
            System.out.printf("Score %d to %d", scoreB, scoreA);
            System.out.println();
        }
    }
}
