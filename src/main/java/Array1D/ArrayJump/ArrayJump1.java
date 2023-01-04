package Array1D.ArrayJump;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ArrayJump1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            arr[i] = sc.nextInt();
        }

        int jump = 0;
        int current = 1;
        while (current <= N && jump < 5) {
            int val = arr[current];
            System.out.println(current + " " + val);
            current += val;
            ++jump;
        }
        
        if (jump < 5) {
            System.out.println("out of bounds");
        }
    }
}
