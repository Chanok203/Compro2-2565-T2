package Array2D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int[][] arr = new int[R+1][];
        for (int r = 1; r <= R; ++r) {
            int C = sc.nextInt();
            arr[r] = new int[C];
            for (int c = 0; c < C; ++c) {
                arr[r][c] = sc.nextInt();
            }
        }
        int sum = 0;
        int max = -1_001;
        int min = 1_000;
        int countMiss = 0;
        while (true) {
            int r = sc.nextInt();
            if (r == 0) {
                break;
            }
            
            int c = sc.nextInt();
            boolean validArray = (1 <= r) && (r <= R);
            if (!validArray) {
                ++countMiss;
                continue;
            }
            
            int[] array = arr[r];
            boolean validIndex = (0 <= c) && (c < array.length);
            if (!validIndex) {
                ++countMiss;
                continue;
            }
            
            int val = arr[r][c];
            sum += val;
            if (max < val) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(countMiss);
    }
}
