package Array1D.Lease;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Lease2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0 ; i < N ; ++i) {
            arr[i] = sc.nextInt();
        }
        int year = sc.nextInt() - 1;
        for (int i = 0 ; i < N ; ++i) {
            arr[i] += year;
        }
        
        int Y = sc.nextInt();
        for (int y = 0 ; y < Y ; ++y) {
            int x = sc.nextInt();
            boolean printed = false;
            for (int i = 0 ; i < N ; ++i) {
                if (x > arr[i]) {
                    System.out.print((i+1) + " ");
                    printed = true;
                }
            }
            if (!printed) {
                System.out.print("full");
            }
            System.out.println();
        }
        
    }
}
