package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ArrayOcc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int K = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int max = -1;
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
            if (arr[k] > max) { // Find max
                max = arr[k];
            }
        }
        
        
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        for (int i = 1 ; i <= N ; ++i) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
