package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ArrayOcc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int K = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0 ; i < K ; ++i) {
            int k = sc.nextInt();
            if (k <= 0 || N < k) { // Out of bound
                ++count2;
                continue;
            }
            
            
            if (arr[k] > 0) { // Duplicate
                ++count3;
            } else { // Success
                ++count1;
            }
            
            ++arr[k];
        }
        
        int max = 0;
        int L = 0;
        for (int i = 1 ; i <= N ; ++i) {
            if (arr[i] != 0) {
                L = 0;
                continue;
            }
            ++L;
            if (L > max) {
                max = L;
            }
        }
        
        System.out.println(max);
        for (int i = 1 ; i <= N ; ++i) {
            if (arr[i] != 0) {
                L = 0;
                continue;
            }
            ++L;
            if (L == max) {
                System.out.print( i + " ");
            }
        }
    }
}
