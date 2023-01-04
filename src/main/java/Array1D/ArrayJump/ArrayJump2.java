package Array1D.ArrayJump;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ArrayJump2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int current = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            arr[i] = sc.nextInt();
        }
        
        while (current <= N) {
            int val = arr[current];
            System.out.println(current + " " + val);
            current += val;
        }
        
        System.out.println("out of bounds");
    }
}
