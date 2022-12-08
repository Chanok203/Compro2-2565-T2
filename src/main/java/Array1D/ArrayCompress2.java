package Array1D;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ArrayCompress2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0 ; i < N ; ++i) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int count = 0;
        boolean isTargetBefore = false;
        for (int i = 0 ; i < N ; ++i) {
            
            if (arr[i] == a || arr[i] == b || arr[i] == c) {
                if (isTargetBefore) {
                    continue;
                }
                if (i != 0) {
                    System.out.print(count + " ");
                }
                System.out.print(arr[i] + " ");
                count = 0;
                isTargetBefore = true;
            } else {
                count += arr[i];
                isTargetBefore = false;
            }
        }
        if (count > 0) {
            System.out.println(count);
        }
    }
}
