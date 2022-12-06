package Array1D;
import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Lease1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0 ; i < N ; ++i) {
            arr[i] = sc.nextInt();
        }
        int Y = sc.nextInt() - 1;
        for (int i = 0 ; i < N ; ++i) {
            System.out.print((arr[i] + Y) + " ");
        }
        System.out.println();
        
        /*
        Create
        index: 0 1 2 3 4 5 6 7 8 9
        value: 0 0 0 0 0 0 0 0 0 0
        
        Read
        index: 0  1 2 3 4 5 6  7  8 9
        value: 5 10 0 0 5 5 5 10 10 0
        
        Process
        index: 0  1 2 3 4 5 6  7  8 9
        value: 5 10 0 0 5 5 5 10 10 0
        +2565-1
        
        value: 2569 2574 2564 2564 2569 2569 2569 2574 2574 2564
        
        */
    }
}
