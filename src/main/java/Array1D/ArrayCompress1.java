package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ArrayCompress1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0 ; i < N ; ++i) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        int count = 0;
        for (int i = 0 ; i < N ; ++i) {
            if (arr[i] == k) {
                System.out.print(count + " " + k + " ");
                count = 0;
            } else {
                count += arr[i];
            }
        }
        System.out.println(count);
    }
}
