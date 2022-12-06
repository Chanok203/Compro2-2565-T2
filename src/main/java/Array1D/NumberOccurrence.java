package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0 ; i < N ; ++i) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean printed = false;
        for (int i = 0 ; i < N ; ++i) {
            if (arr[i] == k) {
                System.out.print( (i+1) + " ");
                printed = true;
            }
        }
        if (!printed) {
            System.out.print("0");
        }
    }
}
