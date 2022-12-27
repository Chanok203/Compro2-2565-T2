package String;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class WordStats1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] stat = new int[26];
        for (int i = 0; i < N; ++i) {
            String msg = sc.next();
            char first = msg.charAt(0);
            stat[first - 'A']++;
        }
        for (int i = 0; i < 26 ; ++i) {
            if (stat[i] == 0) {
                continue;
            }
            
            char c = (char) (i + 'A');
            int count = stat[i];
            System.out.println(c + " " + count);
        }
    }
}
